package com.javaex.practice02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		//문제14
		
		double profit, tax;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("수익을 입력해 주세요.\n금익: ");
		profit=sc.nextDouble();
		
		if(0<=profit&&profit<=1000) {
			tax=0.09*profit;
			System.out.println("소득세는 "+tax+"만원입니다.");
			
		}else if(1000<profit&&profit<=4000) {
			tax=1000*0.09+0.18*(profit-1000);
			System.out.println("소득세는 "+tax+"만원입니다.");
			
		}else if(4000<profit&&profit<8000) {
			tax=1000*0.09+3000*0.18+0.27*(profit-4000);
			System.out.println("소득세는 "+tax+"만원입니다.");
			
		}else if(profit>=8000) {
			tax=1000*0.09+3000*0.18+4000*0.27+0.36*(profit-8000);
			System.out.println("소득세는 "+tax+"만원입니다.");
			
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		/*주의:
		System.out.println("소득세는 "+tax+"만원입니다."); --> 처음에는 이 출력문을 if문 밖에 마지막에 놨는데
		else에 tax값이 없으니까 오류남. else에 tax=0; 넣으면 돌아가긴 하는데 else 후에 "소득세는~원" 문구가 뜸.*/
		
		sc.close();

	}

}
