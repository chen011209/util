package com.example.demo.util.code.http;

import com.alibaba.fastjson.JSON;
import org.apache.hc.client5.http.ClientProtocolException;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 使用http请求获取数据
 */
public class HttpRequest {
    // in milliseconds
    private static final int DEFAULT_TIMEOUT = 5000;

    public String httpGetString(String url) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setConnectTimeout(DEFAULT_TIMEOUT);
        connection.setReadTimeout(DEFAULT_TIMEOUT);
        connection.setRequestMethod("GET");
        int status = connection.getResponseCode();
        if (status != 200) {
            throw new IOException("Server responded with HTTP "+ status);
        }
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder builder = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            builder.append(inputLine);
        }
        in.close();
        connection.disconnect();
        return builder.toString();
    }

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 100; i++) {
            System.out.println(new HttpRequest().httpGetString("http://jgxy.jxutcm.edu.cn/info/1118/2026.htm"));;

        }

    }


    /**
     * 需要加这个依赖建立http
     *         <dependency>
     *             <groupId>org.apache.httpcomponents.client5</groupId>
     *             <artifactId>httpclient5</artifactId>
     *             <version>5.2.1</version>
     *         </dependency>

     这个以来处理json
     <dependency>
     <groupId>com.alibaba</groupId>
     <artifactId>fastjson</artifactId>
     <version>1.2.47</version>
     </dependency>

     * @return
     * @throws Exception
     */
    public String httpPostJson(String url,HashMap<String,String> hashMap) throws Exception{

        try (final CloseableHttpClient httpclient = HttpClients.createDefault()) {
            final HttpPost httppost = new HttpPost(url);


            httppost.setHeader("Accept", "application/json");
            httppost.setHeader("Content-type", "application/json");


            System.out.println(url);
            System.out.println(JSON.toJSONString(hashMap));
            final StringEntity stringEntity = new StringEntity(JSON.toJSONString(hashMap));
            httppost.setEntity(stringEntity);


//            final List<BasicNameValuePair> params = new ArrayList<>();
//            params.add(new BasicNameValuePair("appId", "CYC_TEST"));
//            params.add(new BasicNameValuePair("appSecret", "cyc_TEST_123456_@"));
//            params.add(new BasicNameValuePair("tenantid", "xindeco"));
//            params.add(new BasicNameValuePair("accountId", "1454388596386563072"));
//            params.add(new BasicNameValuePair("language", "zh_CN"));
//            httppost.setEntity(new UrlEncodedFormEntity(params));

            // Create a custom response handler
            final HttpClientResponseHandler<String> responseHandler = response -> {
                final int status = response.getCode();
                if (status >= HttpStatus.SC_SUCCESS && status < HttpStatus.SC_REDIRECTION) {
                    final HttpEntity entity = response.getEntity();
                    try {
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } catch (final ParseException ex) {
                        throw new ClientProtocolException(ex);
                    }
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            };
            final String responseBody = httpclient.execute(httppost, responseHandler);

            return responseBody;
        }

    }


}
