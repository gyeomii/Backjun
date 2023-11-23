package com.study.backjun.class1;

import java.util.Scanner;

public class baekjoon10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if(arr[s.charAt(i)-'a'] == -1) {
				arr[s.charAt(i)-'a'] = i;
			}
		}
	for (int i : arr) {
		System.out.print(i + " ");
	}
	}
}