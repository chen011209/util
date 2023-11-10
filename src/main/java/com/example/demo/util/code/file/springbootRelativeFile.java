package com.example.demo.util.code.file;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.InputStream;


public class springbootRelativeFile {


	public void getFile(){

		/**
		 * getFile好像不行 用getStream
		 */

		/**
		 * springboot读取resources文件夹下的文件
		 * IDEA运行和jar运行都相同结果
		 * 获取的文件和IDEA run edit configuration的路径无关
		 */
		ClassLoader classLoader = getClass().getClassLoader();
		//直接把文件放在resources文件夹下
		File file = new File(classLoader.getResource("SensitiveWord.txt").getFile());

		System.out.println(file.getAbsolutePath());
	}


	public void getStream() throws Exception{
		InputStream inputStream = new ClassPathResource("static/SensitiveWord.txt").getInputStream();
	}


	public static void main(String[] args) {
		new springbootRelativeFile().getFile();
	}
}
