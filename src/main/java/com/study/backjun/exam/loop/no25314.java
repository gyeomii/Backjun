package com.study.backjun.exam.loop;

import java.util.Scanner;

public class no25314 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n/4; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
