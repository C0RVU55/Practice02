package com.javaex.practice02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//문제7
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫 번째 숫자: ");
		int num1=sc.nextInt();
		System.out.print("두 번째 숫자: ");
		int num2=sc.nextInt();
		
		if(num1>=num2) {
			int quo=num1/num2;
			int rest=num1%num2;
			System.out.println("몫: "+quo+"\n나머지: "+rest);
		}else {
			int quo=num2/num1;
			int rest=num2%num1;
			System.out.println("몫: "+quo+"\n나머지: "+rest);
		}
		
		sc.close();

	}

}
