package com.test.exam05;

// 1.인자가 없는 생성자 실행을 통해 A(){}실행
// 2. a.aa(); a 클래스 변수의 aa 메소드를 실행
// 3. a.bb(); a 클래스의 bb 실행. 1,2 받아 3 출력

class A { // 1. class 생성
    private int a;
    private int b;
    static int c; // 컴파일 시 코드 및 데이터 영역이 생성되고, 프로그램 종료 시까지 데이터가 유지된다.

    A(){ //2. 인자가 없는 생성자는 컴파일 시 자동으로 생성
        System.out.println("A 클래스가 생성");
        aa();
    }
    A(int a, int b){ //2. 인자가 2개인 생성자 
        this.a = a;
        this.b = b;
        c = bb(a, b);
    }

    void aa(){
        System.out.println("A클래스의 aa 메소드");
    }

    int bb(int i, int j){

        return i+j;
    }
}

abstract class C { //부모 클래스
    int a;
    int b;

    void cc(){
        System.out.println("C클래스...");
    }

    abstract void cc1(); // 추상 클래스의 추상 메소드는 실행부가 없다.

}

class D extends C { // 자식 클래스
     int d;
     int e;

     @Override
     void cc1() {
        System.out.println("D클래스의 cc1 메소드");
    }
     
    void dd(){
     System.out.println("D클래스의 dd 메소드");
    }
}

interface E { // 인터페이스를 주로 blueprint에 비유한다.

    void ee1(); // 인터페이스는 실행부만 만들 수 있다.
    void ee2();
    
}

class F implements E {

    @Override
    public void ee1() {
        System.out.println("Class F's ee1 method");
        
    }

    @Override
    public void ee2() {
        System.out.println("Class F's ee2 method");
        
    }
}

class G{ // 내부 클래스는 static으로 만들 수 있다.

    static class GG{ // 내부 클래스
         int i = 0;
         void gg(){
             System.out.println("GG내부 클래스");
         }
    }

}

public class Exam05 {
 public static void main(String[] args) { // main method는 entry point(기준점)로 제일 먼저 실행
                                          //static으로 선언된 메소드는 컴파일 시 완성되어 메소드 영역에 자료가 보관
    A a = new A(); // new : 생성자를 메모리에 로딩
    a.aa();
    System.out.println(a.bb(1, 2));   

    A aa = new A(3,4); // 참조형 변수 선언. Heap 영역에 저장

    System.out.println(aa.c);
    System.out.println(a.c);

    D d = new D(); // 인자 없는 default 생성자 밖에 없음
    d.cc1();

    F f = new F();
    f.ee1();
    f.ee2();

    new A(); // new로 메모리에 로딩만해도 class를 실행할 수 있다.

    G.GG g = new G.GG(); // 내부클래스 선언 및 초기화
    g.gg();

    }   
}
