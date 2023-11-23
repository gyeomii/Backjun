package com.study.backjun.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baekjoon02475 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (byte b : br.readLine().getBytes()) {
			if (b == 32) {
			} else {
				sum += (b - 48) * (b - 48);
			}
		}
		System.out.println(sum % 10);
	}
}
