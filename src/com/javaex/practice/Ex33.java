package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {

		System.out.print("반지름: ");
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		double vol = (r * r * r * 3.14 *4)/3;
				
		System.out.print("구의 부피는:"+vol+"입니다."); // 왜 12는 7234.56으로 반올림?
		
		
		sc.close();
		
		
		
	}

}
