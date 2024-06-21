package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {

		System.out.print("가로: ");
		
		Scanner sc = new Scanner(System.in);
		
		double wid = sc.nextDouble();
		
		System.out.print("세로: ");
		double len = sc.nextDouble();
		
		System.out.print("삼각형의 넓이는: "+wid*len/2+"입니다.");
		
		sc.close();
		//
		
	}

}
