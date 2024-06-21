package com.javaex.practice;

public class Ex25 {

	public static void main(String[] args) {

		int a = 13;
		
		//(a>13) && (a>=13) F
		//(a>13) || (a>=13) T
		//(a/3==4) && (a%3==2) F
		//(a/3==4) || (a%3==2) T
		//(a/3==4) && (a%3==2) || a/3==4 T
		
		System.out.println((a>13) && (a>=13)); 
		System.out.println((a>13) || (a>=13));
		System.out.println((a/3==4) && (a%3==2));
		System.out.println((a/3==4) || (a%3==2));
		System.out.println((a/3==4) && (a%3==2) || a/3==4);
		
	}

}
