package com.javaex.practice;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
	
		System.out.print("전체 연필개수를 입력해주세요: ");
		
		Scanner sc = new Scanner(System.in);
		int pen  = sc.nextInt();
		
		System.out.print("전체 인원수를 입력해주세요: ");
		int peo  = sc.nextInt();
		
		int nPen = pen/peo;
		int nRest = pen%peo;
		
		System.out.print("1인당 연필의 갯수는 "+nPen+" 입니다.");
		System.out.print("연필의 나머지 갯수는 "+nRest+" 입니다.");
		
		sc.close();
	
		
	}
}
