package com.test.exam02;//자바 파일의 최상단에 '패키지' 작성

import java.util.Scanner;//외부 패키지로부터 클래스를 가져온다.

public class JavaStructure {
	public static int sum(int a, int b) {
		return a+b;
	}//return 해주는 값(a+b)은 "public static int" 즉, 정수형(int)이다.
	public static void main(String[] argv) {// 컴파일시 정의, 호출하는 메소드 역시 static
		int i=10;
		long l_value=10L;//long 타입 식별자 'L' 소문자도 사용 가능
		double d_value=10;
		float f_value=10;
		
		System.out.println("Integer i = "+i+"\n"+"Long type l_value = "+l_value+"\n");
		System.out.println("Double d_value = "+d_value+"\n"+"Float type = "+f_value+"\n");
		
		String[] names = new String[3];
		int size = names.length;
		
		System.out.println(size);//names 배열의 크기 : 3
		
		Scanner put = new Scanner(System.in);
		
		for(int idx=0; idx<size; idx++) {
			System.out.println("이름을 입력하세요");
			names[idx]=put.nextLine();
		}
		for(int idx=0; idx<size; idx++) {
			System.out.println("이름 : "+names[idx]);
		}
		
		put.close();//21번째 줄, 콘솔에서 값을 읽어오는 것을 닫아줌
	}
}
