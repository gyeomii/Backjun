package com.study.backjun.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon11720 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();//입력만 받음
		int sum = 0;
		for (Byte b : br.readLine().getBytes()) {
			//br.readLine().getBytes() : 한 줄 입력받고 byte단위로 꺼내옴
			sum += b - '0';
		}
		System.out.println(sum);
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		String str = sc.next();
//		sc.close();
//		int sum=0;
//		for(int i = 0; i < n; i++) {
//			sum += str.charAt(i)-'0';
//		}
//		System.out.println(sum);
	}
}
