package com.javaex.practice02;

public class Ex01 {

	public static void main(String[] args) {
		//문제1
		
		int age=15;
		
		//age가 0살 초과이고 18살 미만이면
		/*
		 if(0<age<18) {
			System.out.println("청소년입니다.");
		}
		*/
		
		//if 조건문 안에 조건을 여러 개 쓰려면 논리연산자로 묶어줘야 함.
		
		if(age>0 && age<18) {
			System.out.println("청소년입니다.");
		}
		
		
	}

}
