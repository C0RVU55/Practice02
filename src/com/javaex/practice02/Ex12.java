package com.javaex.practice02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		//문제12
		
		String mark;
		double n1, n2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호(사칙연산): ");
		mark=sc.nextLine();
		System.out.print("숫자1: ");
		n1=sc.nextDouble();
		System.out.print("숫자2: ");
		n2=sc.nextDouble();
		
		if(n1!=0||n2!=0) {
			switch(mark) {
				case "+":
					System.out.println("결과는 "+(n1+n2));
					break;
				case "-":
					System.out.println("결과는 "+(n1-n2));
					break;
				case "*":
					System.out.println("결과는 "+(n1*n2));
					break;
				case "/":
					System.out.println("결과는 "+(n1/n2));
					break;
				default:
					System.out.println("계산할 수 없는 기호입니다.");
					break;
			}
			//처음에는 if(mark=="+"||mark=="-"||mark=="*"||mark=="/") 이렇게 했는데
			//사칙연산은 String이 아니라서 계산이 안 되는듯.  
			
			
		}else {
			System.out.println("계산할 수 없습니다.");
		}
		
		sc.close();

	}

}
