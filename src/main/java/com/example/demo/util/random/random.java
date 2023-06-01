package com.example.demo.util.random;

import java.util.Random;

public class random {
	public static void main(String[] args) {
		int random;
		Random random1 = new Random();
		for (int i = 0; i < 5000; i++) {
//			0到99
			random = Math.abs(random1.nextInt()%100);
			if(random==0){
				System.out.println(random);
			}

		}
	}
}
