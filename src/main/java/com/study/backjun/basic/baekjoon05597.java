package com.study.backjun.basic;

import java.util.Scanner;

public class baekjoon05597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] std = new int[31];
		
		for(int i=1; i<29; i++) {
			int done = sc.nextInt();
			std[done] = 1;
		}
		for(int i=1; i<std.length; i++) {
			if(std[i]!=1)
				System.out.println(i);
		}
		sc.close();
	}
}