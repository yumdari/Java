package com.test.exam02;

import java.util.Arrays;

public class ArrayExam {
	public static void main(String[] argv) {
		int[] a=new int[] {1,2,3,4,5,6};
		
		for(int idx=0; idx<a.length; idx++) {
			System.out.println(a[idx]+" ");
		}
		
		System.out.println("\n");
		
		for(int idx: a) System.out.print(idx+ " ");//System.out.print, 출력시 라인 변동 없음
		
		System.out.println("\n");
		System.out.println(Arrays.toString(a));
		System.out.println("\n");
		
		int[][] b= {{1,2,3}, {4,5,6}, {7,8,9}};
		
		for(int idx=0; idx<3; idx++) {
			for(int jdx=0; jdx<3; jdx++) {
				System.out.print(b[idx][jdx]+" ");
				if(jdx==2) System.out.println(" ");
			}
		}//2차원 배열 출력
		System.out.println(" "); // System.out.print("\n"); 와 같던데
		
		for(int idx=0; idx<b.length; idx++) {
			System.out.println(Arrays.toString(b[idx]));
		}
		
		String str = "hello";
		
		switch(str) {//문자열, 정수 모두 가능
		case "Hi": System.out.println("Hi");
			break;
		case "Good": System.out.println("Good");
			break;
		case "Bye": System.out.println("Bye");
			break;
		default: System.out.println("hello 인가?"); //if문의 else와 같은 기능
		}
		
		int k=0, s=0;
		
		while(true) {//반복문 안의 변수 값이 참일때만 계속 반복
			s+=k;
			k++;
			if(k < 100) continue;
			else if(k == 100) break;
		}
		System.out.println("s = "+s);
	}//End of main
}
