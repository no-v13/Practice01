package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {

		// C = 5/9*(F-32) F = (C*9/5)+32
		System.out.print("화씨:");
		
		Scanner sc = new Scanner(System.in);
		
		double F = sc.nextDouble();
		double C = (F-32)*5/9; //식이 문제인고 같음_ 왜..?
		                        //C = 5/9*(F-32) 앞에가 정수라 좀 나누면 이상해지는 거 같음
		
		System.out.print("화씨 "+F+"의 섭씨온도는 "+C+" 입니다.");
		sc.close();
		
		
	}

}
