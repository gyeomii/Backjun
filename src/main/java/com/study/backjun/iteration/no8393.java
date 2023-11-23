package com.study.backjun.iteration;

import java.util.Scanner;

public class no8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =0;
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			a += i;
		}
		System.out.println(a);
	}
}
