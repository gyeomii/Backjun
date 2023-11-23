package com.study.backjun.class1;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon02920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[8];
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] desc = {8, 7, 6 ,5, 4, 3, 2, 1};
		
		if(Arrays.equals(n, asc)) {
			System.out.println("ascending");
		}else if(Arrays.equals(n, desc)) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}
