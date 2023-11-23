package com.study.backjun.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon02588 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String str = br.readLine();
		br.close();
		char[] c = str.toCharArray();
		System.out.println(a * (c[2] - '0'));
		System.out.println(a * (c[1] - '0'));
		System.out.println(a * (c[0] - '0'));
		System.out.println(a * Integer.parseInt(str));
		}
}
