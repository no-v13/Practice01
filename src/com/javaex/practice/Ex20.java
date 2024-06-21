package com.javaex.practice;

public class Ex20 {

	public static void main(String[] args) {

		int i =10;             
		int n = i++ %2;       // n은 10%2하고 값 저장 후에 i+1저장될듯
		
		System.out.println(i); // i = 11
		System.out.println(n); // n = 0
		
	}

}
