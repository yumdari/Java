package com.text.exam02; //패키지는 자바 파일의 최상단에 위치

import java.util.Scanner; //외부 패키지로부터 클래스를 가져온다.

public class JavaStructure {
	public static int sum(int a, int b) {
		return a+b;
	}
	public static void main(String[]argv) {
		int i = 10;
		long l_value = 10L;
		double d_value = 10;
		float f_value = 10;
		char a;
		
		i = sum(i, 10);
		a = '가';
		System.out.println("Hello, World.");
		System.out.println("Integer타입i="+Integer.toString(i));
		System.out.println("double타입d value="+Double.toString(d_value));
		System.out.println("float타입f value="+Float.toString(f_value));
		System.out.println("long타입l value="+Long.toString(l_value));
		System.out.println("char타입a="+a);
		
		String[] names = new String[3];
		int size = names.length;
		
		Scanner put = new Scanner(System.in);
		for(int index=0; index<size; index++) {
			System.out.println("이름을 입력하세요");
			names[index] = put.nextLine();
		}
		for(int index=0; index<size; index++) {
			System.out.println("이름 : "+names[index]);
		}
		put.close();
	}
}
