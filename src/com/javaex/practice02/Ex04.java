package com.javaex.practice02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//문제4
		
		int age;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요\n나이: ");
		age=sc.nextInt();
		
		if(19<=age&&age<65) {
			System.out.print("1번 그룹");
		}else {
			System.out.print("2번 그룹");
		}
		System.out.println("입니다.");
		
		sc.close();

	}

}
