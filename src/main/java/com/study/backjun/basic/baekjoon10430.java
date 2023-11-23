package com.study.backjun.basic;

import java.util.Scanner;

public class baekjoon10430 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int q1 = (a+b)%c;
		int q2 = ((a%c) + (b%c))%c;
		int q3 = (a*b)%c;
		int q4 = ((a%c)*(b%c))%c;
		
		System.out.println(q1 + "\n" + q2 + "\n" + q3 + "\n" + q4);
	}
}
