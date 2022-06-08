package com.test.exam03;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface //Annotation
interface MyLamdaFunction { //람다함수식 사용 하기 위한 인터페이스 선언
	int sum(int a, int b);
}
@FunctionalInterface //Annotation
interface Myprint{ //사용자 무기명 인터페이스 ?
	String printLamda();
}

public class LamdaExam {
	public static void main(String[] args) {
		
		MyLamdaFunction lamdafunction = (int a, int b)->a+b; //파라미터만 존재 함수명 없음, -> : return과 같은 의미 (익명함수)
		System.out.println(lamdafunction.sum(3, 4));
		
		Myprint myPrint = ()->"Hello World !";//받을 인자가 없기 때문에 ()만 작성
		System.out.println(myPrint.printLamda());
		
		//Supplier : 매개변수 없이 반환값만을 갖는 함수형 인터페이스
		Supplier<String> supplier = ()->"Hello World 2"; //<>안은 타입명
		System.out.println(supplier.get());
		
		//Consumer : 객체 T를 매개변수로 받아서 사용, 반환값(리턴값)이 없는 함수형 인터페이스
		Consumer<String> consumer = (str)->System.out.println(str.split(" ")[0]);  //" " 공백을 기준으로 문장 분열 ?
		consumer.andThen(System.out::println).accept("Hello World"); //
		
		//Function : 객체 T를 매개변수로 받아서 처리한 후 R로 반환하는 함수형 인터페이스
		Function<String, Integer> function = str->str.length();  //str : 변수, str이 받는 string 값의 길이 반환
		System.out.println(function.apply("Hello World ;;"));
		
		//Predicate : 객체 T를 매개변수로 받아서 처리한 후 Boolean을 반환
		Predicate<String> predicate = (str)->str.equals("Hello World"); //String형 변수 str, equals 메소드 : 문자열 비교
		System.out.println(predicate.test("Hi World"));
		
		//일반 참조형, 메소드 참조형, 생성자 참조형 ... 등등
		
		//일반 참조형
		Function<String, Integer> function2 = String::length;
		System.out.println(function2.apply("Hello World"));
		
		//메소드 참조형
		Consumer<String> consumer2 = System.out::println; //"System.out" : 클래스, println : 메소드
		consumer2.accept("Hello World 3");
		
		//Supplier<String> supplier1 = String::new; : 새로운 생성자도 생성 가능
	}
}
