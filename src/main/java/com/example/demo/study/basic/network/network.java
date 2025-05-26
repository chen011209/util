package com.example.demo.study.basic.network;

public class network {
    /**
     * 代理
     * 正向代理是客户端的代理，帮助客户端突破访问控制，如VPN；反向代理是服务器的代理，帮助服务器实现负载均衡，安全防护。
     */

    /**
     * 测试一个服务端能不能通可以用 ping telnet curl
     *  ping api-center-dev.xindeco.com
     *  telnet api-center-dev.xindeco.com 443
     *  curl http://192.168.100.80:7910
     * 可以先ping一下测试 但有些服务器禁ping了
     *
     * 可以用telnet远程连接测试 如 telnet api-center-dev.xindeco.com 443  （443是https常用端口）
     *
     * curl c是client的意思
     */

    /**
     * 网关作为网络的入口，负责处理网络层的通信和路由，将外部网络的请求转发到内部网络的相应服务器上。
     * Nginx 除了作为高性能的 Web 服务器外，也常被用于反向代理和负载均衡等场景。
     * 在很多架构中，网关可以将请求转发给 Nginx 服务器，由 Nginx 进一步处理请求
     */

    /**
     * 配置nginx转发
     *  注意server_name 填写的是部署nginx机器的ip或域名
     *  机器A访问机器B nginx部署在机器B上
     *  server_name 填写机器A访问机器B，使用的机器B的域名或ip （一台机器可能有多个ip、域名）
     *
     *  仅允许机器A的ip访问可以用allow和deny配置来（这里没写）
     *
     *  配置完成后 检查配置文件语法  sudo nginx -t  语法无误，重启 Nginx 服务 sudo systemctl restart nginx
     *  在nginx部署的机器上试一下curl http://192.168.100.80:7910，成功说明nginx可以转发
     *
     *  在其他机器上访问nginx机器，服务器没有连接，可能是nginx机器上的防火墙没有打开
     *
     *  检查防火墙状态 sudo systemctl status firewalld
     *  增加端口
     *  # 永久开放 TCP 协议的 7910 端口
     * sudo firewall-cmd --permanent --add-port=7910/tcp
     * # 永久开放 UDP 协议的 7910 端口（如果需要）
     * sudo firewall-cmd --permanent --add-port=7910/udp
     * # 重新加载防火墙规则使配置生效
     * sudo firewall-cmd --reload
     *  查看防火墙放行端口 sudo firewall-cmd --list-ports
     *
     * server {
     *     # 监听本地的 7910 端口
     *     listen 7910;
     *     server_name 192.168.100.80; #可选:域名或机器B的IP
     *
     *     location / {
     *         # 将请求转发到目标 IP 和端口
     *         proxy_pass http://192.168.1.100:8080;
     *
     *         # 设置代理头信息
     *         proxy_set_header Host $host;
     *         proxy_set_header X-Real-IP $remote_addr;
     *         proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
     *         proxy_set_header X-Forwarded-Proto $scheme;
     *     }
     * }
     */
}
