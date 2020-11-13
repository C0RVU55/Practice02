package com.javaex.practice02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//문제5
		
		double height;
		double weight;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력하세요.");
		System.out.print("키: ");
		height=sc.nextDouble();
		System.out.print("몸무게: ");
		weight=sc.nextDouble();

		double standard=(height-100)*0.9;
		
		if(weight<standard) {
			System.out.println("저체중입니다.");
		}else if(weight>standard) {
			System.out.println("과체중입니다.");
		}else {
			System.out.println("표준입니다.");
		}
		System.out.println("표준체중: "+standard);
		
		sc.close();
	}

}
