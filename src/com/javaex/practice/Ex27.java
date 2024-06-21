package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		System.out.print("반지름을 입력하세요: ");
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		
		System.out.print("원의 넓이:"+r*r*3.14);
		
		sc.close();
		
		
		
	}

}
