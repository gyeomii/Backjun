package com.study.backjun.class1;

import java.util.Scanner;
public class baekjoon02884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		System.out.println(h = (m<45)?(h==0?23:h-1): h);
		System.out.println(m = (m<45)? m+15 : m-45);
	}
}