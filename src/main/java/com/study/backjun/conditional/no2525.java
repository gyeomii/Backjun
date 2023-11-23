package com.study.backjun.conditional;

import java.util.Scanner;

public class no2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int addMin = sc.nextInt();
		sc.close();
		int hh = hour+((min+addMin)/60);
		System.out.print((hour =(min+addMin)<60?hour:(hh>23?hh-24:hh)) + " ");
		System.out.print(min = (min+addMin)<60?min+addMin:(min+addMin)%60);
	}
}
