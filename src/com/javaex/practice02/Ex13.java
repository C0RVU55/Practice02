package com.javaex.practice02;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		//문제13
		
		double x, result;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력해주세요.\n숫자: ");
		x=sc.nextDouble();
		
		if(x<=0) {
			result=x*x*x-9*x+2;
		}else {
			result=7*x+2;
		}
		
		System.out.println("계산 결과는 "+result+"입니다.");
		
		sc.close();

	}

}
