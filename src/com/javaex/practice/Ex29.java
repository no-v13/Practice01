package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {

		System.out.print("가로를 입력하세요:");
		
		Scanner sc = new Scanner(System.in);
		double wid = sc.nextDouble();
		
		
	
		System.out.print("세로를 입력하세요");
		double len = sc.nextDouble();
		
		System.out.print("사각형의 넓이: "+wid*len);
		System.out.print("사각형 둘레: "+(wid+len)*2);
		
		sc.close();
		
		//
		
		
	}

}
