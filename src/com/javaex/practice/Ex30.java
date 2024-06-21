package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {

		// 1mile = 1.609
		
		System.out.print("마일을 입력하세요: ");
		
		Scanner sc = new Scanner(System.in);
		
		double mile = sc.nextDouble();
		System.out.print(mile+"은"+(mile*1.609)+"km 입니다.");
		
		
		sc.close();
		
		
		
	}

}
