package com.javaex.practice02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		//문제8
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력하세요.");
		System.out.print("숫자1: ");
		int n1=sc.nextInt();
		System.out.print("숫자2: ");
		int n2=sc.nextInt();
		System.out.print("숫자3: ");
		int n3=sc.nextInt();
		
		if(n1<n2&&n1<n3) {
			System.out.println("가장 작은 수는 "+n1+"입니다.");
		}else if(n2<n1&&n2<n3) {
			System.out.println("가장 작은 수는 "+n2+"입니다.");
		}else {
			System.out.println("가장 작은 수는 "+n3+"입니다.");
		}
		
		sc.close();

	}

}
