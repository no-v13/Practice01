package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {

		System.out.print("환전할 원화를 입력하세요:");
		//1$ =1230.95
		Scanner sc = new Scanner(System.in);
		
		double won = sc.nextDouble();
		double dal = won/1230.95;
		// $ = 값/상수
		
		System.out.println("받으실 달러는: "+ dal);
		
		sc.close();
		
	}

}
