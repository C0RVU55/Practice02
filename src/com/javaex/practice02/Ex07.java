package com.javaex.practice02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//문제7
		
		int num1, num2, quo, rest;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫 번째 숫자: ");
		num1=sc.nextInt();
		System.out.print("두 번째 숫자: ");
		num2=sc.nextInt();
		
		if(num1>=num2) {
			quo=num1/num2;
			rest=num1%num2;
			
		}else {
			quo=num2/num1;
			rest=num2%num1;
			
		}
		System.out.println("몫: "+quo+"\n나머지: "+rest);
		
		sc.close();

	}

}
