package com.javaex.practice02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		//문제6
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력하세요.");
		System.out.print("숫자1: ");
		int num1=sc.nextInt();
		System.out.print("숫자2: ");
		int num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println("큰 수: "+num1+"\t작은 수: "+num2+"입니다.");
		}else if(num1<num2) {
			System.out.println("큰 수: "+num2+"\t작은 수: "+num1+"입니다.");
		}else {
			System.out.println("같은 숫자입니다.");
		}
		
		sc.close();

	}

}
