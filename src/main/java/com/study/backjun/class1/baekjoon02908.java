package com.study.backjun.class1;

import java.util.Scanner;

public class baekjoon02908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb1 = new StringBuffer(sc.next());
		StringBuffer sb2 = new StringBuffer(sc.next());
		sc.close();
		int r1 = Integer.parseInt(sb1.reverse().toString());
		int r2 = Integer.parseInt(sb2.reverse().toString());
		System.out.println(r1 > r2 ? r1 : r2);
	}
}