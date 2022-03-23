package com.test.exam01;
public class SumExam {
    public static void main(String[] args) {
        int sum = 0;
        for (int idx = 0; idx<=100; idx ++){
            sum += idx;
        }
        System.out.println("결과값은 =" + sum);
    }
}
