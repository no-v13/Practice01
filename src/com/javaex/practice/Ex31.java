package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {

		System.out.print("상품가격: ");
		Scanner sc = new Scanner(System.in);
		
		double prc = sc.nextDouble();
		
		System.out.print("받은 돈: ");
		double mon = sc.nextDouble();
		System.out.println("================");
		
		System.out.println("받은 돈: "+mon);
		System.out.println("상품가격: "+prc);
		System.out.println("부가세: "+(prc*0.1));
		System.out.println("잔액: "+(mon-(prc*0.1)));
		sc.close();
		
		
		
	}

}
