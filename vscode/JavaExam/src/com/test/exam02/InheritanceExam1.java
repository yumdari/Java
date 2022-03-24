package com.test.exam02; 
//main method를 기준(entry point)으로 명령어를 실행
//child class의 instance 생성
//child 생성사 실행
//super(); 실행
//부모의 생성자 실행
//인자가 없는 부모 클래스 실행 this(1);
//인자가 하나인 부모 클래스 실행
//System.out.println("인자가 1개인 Parents");
//System.out.println("인자가 없는 Parents");
//System.out.println("인자가 없는 Child");

class Parents {
    //생성자는 class의 instance가 생성될 때 가장 먼저 실행되어 
    // 생성자 내에 기술된 명령문을 실행한다.
    //this.전역변수 , super.전역변수
    //this, super a.k.a 지시어, (명령어), 예약어, 키워드 

    Parents(){// Parents의 기본생성자. 생성자는 클래스의 전역 변수(멤버변수)를 초기화시킨다. - int = 0, char = null
        this(1); //자기 클래스의 생성자(=Parents(int i))를 가져옴
        System.out.println("인자가 없는 Parents 클래스의 생성자");
    } 
    Parents(int i){
        System.out.println("인자가 1개인 Parents 클래스의 생성자");
    }
}   

class Child extends Parents {
    
    int c1;
    int c2;

    Child(int c1, int c2){//2개의 인자값을 가져오는 생성자

         this.c1 = c1;
         //this.c1 : Child class의 c1
         //c1 : Child 생성자의 c1
         this.c2 = c2;

    }
    
    Child(){ //class가 만들어지면 생성자가 제일 먼저 작업 시작
        super(); //super : superclass(부모클래스 = Parents)의 생성자를 호출 
        System.out.println("인자가 없는 Child 클래스의 생성자");
    }
}

public class InheritanceExam1 {
    public static void main(String[] args) {
        Child child = new Child(1, 2); // Instance 생성. child 는 Stack 영역에 넣고, Class Capsule에 있는 method와 전역변수는 Heap 영역에 넣음
        System.out.println("Child Class의 전역변수 : " + child.c1 + " " + child.c2);


    }
}
