package com.example.demo.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * java异常处理
 * 异常有三种：
 * 可查异常 CheckedException 如文件不存在  Java程序必须显式使用try catch处理Checked异常
 * 运行时异常RuntimeException 如空指针异常、越界  Runtime异常无需显式声明抛出，如果程序需要捕获Runtime异常，也可以使用try...catch块来实现。
 * 错误Error 如栈溢出
 */
public class exception {

	public static void throwException() throws Exception{
		throw new Exception();
	}

	/**
	 * tryWithResources语法下 try()括号中请求的资源在结束后会被自动销毁
	 * 如果()中请求资源时报错 也会catch
	 */
	public static void tryWithResources(){
		String line;
		try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
			while ((line = br.readLine()) != null) {
				System.out.println("Line =>"+line);
			}
		} catch (IOException e) {
			System.out.println("IOException in try block =>" + e.getMessage());
		}
	}


	public static void main(String[] args) {


		tryWithResources();
//		try {
//			throwException();
//		}catch (Exception e){
//			e.printStackTrace();
//		}


	}
}
