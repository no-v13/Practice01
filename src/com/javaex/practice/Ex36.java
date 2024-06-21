package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {

		System.out.print("500원 개수:");
		
		Scanner sc = new Scanner(System.in);
		int fiv_0 = sc.nextInt();
		
		System.out.print("100원 개수:");
		int ten_0 = sc.nextInt();
		
		System.out.print("50원 개수");
		int fiv = sc.nextInt();
		
		System.out.print("10원 개수:");
		int ten = sc.nextInt();
		
		int tot = (fiv_0 *500)+(ten_0 *100)+(fiv *50)+(ten *10);
		
		System.out.print("동전 총합은"+tot+"원 입니다.");
		
		sc.close();
		
	}

}
