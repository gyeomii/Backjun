package com.study.backjun.class1;

import java.util.Scanner;

public class baekjoon01546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] score = new int[cnt];
		for(int i = 0; i < cnt; i++ ) {
			score[i] = sc.nextInt();
		}
		double max = 0;
		for (int i: score) {
			max = Math.max(i, max);
		}
		double sum=0;
		for (int j : score) {
			sum += j/max*100;
		}
		double avg = sum/cnt;
		
		System.out.println(avg);
	}
}
