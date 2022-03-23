package com.test.exam01;

class Number{
    static int a = 0;
    int b = 0;

    static void print() {
        System.out.println("static method test !!!");
    }

    void print1(){
        System.out.println("instance method test !!!");

    }
}

@SuppressWarnings("all")
public class StaticExam {
    public static void main(String[] args){
        Number number1 = new Number();
        Number number2 = new Number();

        number1.a = 1;
        number1.b = 1;

        System.out.println(number2.a + " " + number2.b);

        Number.print();
        //Number.print1();
    }
}
