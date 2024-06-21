package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {

		System.out.print("전체금액을 입력해주세요: ");
		
		Scanner sc = new Scanner(System.in);
		int tot = sc.nextInt();
		int disc = tot - (tot%1000); 
		
		
		System.out.print(disc);
		
		sc.close();
	}

}
