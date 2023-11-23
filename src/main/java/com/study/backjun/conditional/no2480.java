package com.study.backjun.conditional;

import java.util.Scanner;

public class no2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int money =0;
		if(a==b && b==c) {
			money = 10000 + a*1000;
		}else if(a==b || b==c || a==c) {
			if(a==b || a==c) {
				money = a * 100;
			}else{
				money = b * 100;
			}
			money += 1000;
		}else {
			int max = Math.max(a, Math.max(c, b));
			money = max*100;
		}
		System.out.println(money);
	}
}
