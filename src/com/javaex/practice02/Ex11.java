package com.javaex.practice02;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		//문제11
		
		String str;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("알파벳 1글자(소문자)를 입력하세요.\n알파벳: ");
		str=sc.nextLine();
		
		switch(str) {
			case "a":
				System.out.println("모음입니다.");
				break;
			case "i":
				System.out.println("모음입니다.");
				break;
			case "e":
				System.out.println("모음입니다.");
				break;
			case "u":
				System.out.println("모음입니다.");
				break;
			case "o":
				System.out.println("모음입니다.");
				break;
			case "y":
				System.out.println("모음입니다.");
				break;
				
			case "b":
				System.out.println("자음입니다.");
				break;
			case "c":
				System.out.println("자음입니다.");
				break;
			case "d":
				System.out.println("자음입니다.");
				break;
			case "f":
				System.out.println("자음입니다.");
				break;
			case "g":
				System.out.println("자음입니다.");
				break;
			case "h":
				System.out.println("자음입니다.");
				break;
			case "j":
				System.out.println("자음입니다.");
				break;
			case "k":
				System.out.println("자음입니다.");
				break;
			case "l":
				System.out.println("자음입니다.");
				break;
			case "m":
				System.out.println("자음입니다.");
				break;
			case "n":
				System.out.println("자음입니다.");
				break;
			case "p":
				System.out.println("자음입니다.");
				break;
			case "q":
				System.out.println("자음입니다.");
				break;
			case "r":
				System.out.println("자음입니다.");
				break;
			case "s":
				System.out.println("자음입니다.");
				break;
			case "t":
				System.out.println("자음입니다.");
				break;
			case "v":
				System.out.println("자음입니다.");
				break;
			case "w":
				System.out.println("자음입니다.");
				break;
			case "x":
				System.out.println("자음입니다.");
				break;
			case "z":
				System.out.println("자음입니다.");
				break;
				
			default:
				System.out.println("알파벳 소문자 1글자를 써주세요.");
				break;
		}
		
		/*
		break 없는 switch문
		  switch(str) {
			case "a":
			case "i":
			case "e":
			case "u":
			case "o":
			case "y":
				System.out.println("모음입니다.");
				break;
				
			case "b":
			case "c":
			case "d":
			case "f":
			case "g":
			case "h":
			case "j":
			case "k":
			case "l":
			case "m":
			case "n":
			case "p":
			case "q":
			case "r":
			case "s":
			case "t":
			case "v":
			case "w":
			case "x":
			case "z":
				System.out.println("자음입니다.");
				break;
				
			default:
				System.out.println("알파벳 소문자 1글자를 써주세요.");
				break;
		}
		*/
		
		
		sc.close();

	}

}
