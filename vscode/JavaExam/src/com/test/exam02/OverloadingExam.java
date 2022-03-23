package com.test.exam02;

class A{//멤버 변수는 없음

    public void a() {
        System.out.println("파라미터가 없음");
    }
    public void a(int i, int j){
        System.out.println("파라미터가 있음");
    }

}

public class OverloadingExam {

    public static void main(String[] args) {
        A a = new A();
        a.a();
        a.a(1,2);
    }
    
}
