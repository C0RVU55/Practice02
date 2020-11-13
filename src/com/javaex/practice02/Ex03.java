package com.javaex.practice02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//문제3
		
		//결과 : 20세 초과인 21, 100이 "1번 그룹"이고 나머지는 "2번 그룹"
		
		int age;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		age=sc.nextInt();
		
		if(age>20) {
			System.out.print("\"1번 그룹\"");
		}else {
			System.out.print("\"2번 그룹\"");
		}
		System.out.println("입니다.");
		
		sc.close();

	}

}
