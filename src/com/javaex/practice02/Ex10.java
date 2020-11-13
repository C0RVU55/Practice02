package com.javaex.practice02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		//문제10
		
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("사번(정수)를 입력하세요.\n사번: ");
		num=sc.nextInt();
		
		int team=num%3;
		
		switch(team) {
			case 0:
				System.out.println("A팀입니다.");
				break;
			case 1:
				System.out.println("B팀입니다.");
				break;
			case 2:
				System.out.println("C팀입니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break; //break 까먹지 말기.
		}
		
		sc.close();

	}

}
