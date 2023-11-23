package com.study.backjun.class2;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon04153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] t = new int[3];
		while (true) {
			for (int i = 0; i < 3; i++) {
				t[i] = sc.nextInt();
			}
			if(t[0] == 0 && t[1] == 0 && t[2] == 0) {
				break;
			}
			Arrays.sort(t);
			
			if(Math.pow(t[0], 2) + Math.pow(t[1], 2) == Math.pow(t[2], 2)) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
	}
}
