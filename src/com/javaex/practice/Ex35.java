package com.javaex.practice;

public class Ex35 {

	public static void main(String[] args) {

		
		// c = 300000 1분 =60초 /1시간 60*60초 / 하루 = 24* 60*60 / 1년 = 365*하루
		
		long year = 24*60*60*365L;
		long dis = year*300000L; //문자뒤에 L 붙이면 오류남 (한 문자로 인식해서 숫자뒤에 써야함)
		
		System.out.println("빛이 1년 동안 가는 거리는 "+dis+"km 입니다.");
		
	}

}
