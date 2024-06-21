package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {

		System.out.print("월급을 입력하세요:");
		
		Scanner sc = new Scanner(System.in);
		
		int sal = sc.nextInt();
		int ten = sal*120;
	
		System.out.println("10년동안 최대 저축액은"+ten+"입니다.");
		
		sc.close();
		
		
		
	}

}
