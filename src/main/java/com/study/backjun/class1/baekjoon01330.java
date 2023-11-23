package com.study.backjun.class1;

import java.util.Scanner;

public class baekjoon01330 {
	public static void main(String[] args) {
		// compare number
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();

		scanner.close();

		if (A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}

	}
}
