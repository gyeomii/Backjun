package com.study.backjun.class1;

import java.util.Scanner;

public class baekjoon02562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		int max=0;
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt(); 
			max = (max>num[i] ? max : num[i]); 
		}
		System.out.println(max);
		for (int i = 0; i < num.length; i++) {
			if(max == num[i]) {
				System.out.println(i+1);
			}
		}
	}
}
