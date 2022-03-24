package com.test.exam03;

interface Sales {

    public void manager();
    public void goal();
    public void product();
    ///method 정의


}

class ATeam implements Sales { //interface는 상속받을 때 implements 사용

    @Override
    public void manager() {
        System.out.println("A팀장입니다. 열심히 하겠습니다.");
        
    }

    @Override
    public void goal() {
        System.out.println("A팀은 올해 70억을 달성해보겠습니다.");
    }

    @Override
    public void product() {
        System.out.println("A팀은 TV를 판매하겠습니다.");
        
    }



}

class BTeam implements Sales {

    @Override
    public void manager() {
        System.out.println("B팀 팀장입니다.");
    }

    @Override
    public void goal() {
        System.out.println("B팀은 올해 100억 달성하겠습니다.");
    }

    @Override
    public void product() {
        System.out.println("B팀은 냉장고 팔겠습니다.");        
    }
    
}

public class InterfaceExam {
 
    public static void main(String[] args) {
        
        ATeam aSalesPlan = new ATeam();
        aSalesPlan.manager();
        aSalesPlan.goal();
        aSalesPlan.product();

        BTeam bSalesPlan = new BTeam();
        bSalesPlan.manager();
        bSalesPlan.goal();
        bSalesPlan.product();


    }
    
}
