package com.test.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class Member{

    private String userid; 
    private String username;
    private int age;

    Member(String userid, String username, int age){
        this.userid = userid;
        this.username = username;
        this.age = age;
    }

    //내부 클래스
    static class Builder {
        private String userid;
        private String username;
        private int age;

        public Builder userid(String userid){//메소드 생성
            this.userid = userid;
            return this;
        }
        public Builder username(String username){//메소드 생성
            this.username = username;
            return this;
        }
        public Builder age(int age){//메소드 생성
            this.age = age;
            return this;
        }

        public Member build(){
            if(userid == null || username == null || age == 0){
                throw new IllegalStateException("Member 클래스 생성 불가"); //예외 처리
            }
            return new Member(userid, username, age);
        }
    }// end of Builder class

    // getter, private 형태의 전역변수 가져오기 위함
    public String getUserid(){
        return userid;
    }
    public String getUsername(){
        return username;
    }
    public int getAge(){
        return age;
    }

}

public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException { //Class.forName("org.mariadb.jdbc");, con = DriverManager.getConnection(url, userid, userpw); 구문에 대한 예외처리
        
        String url = "jdbc:mariadb://127.0.0.1:3306/webdev"; // ???. 3306 포트번호, webdev : 사용할 데이터 베이스
        String userid = "webmaster"; //mariadb user
        String userpw = "0429"; //mariadb password
        String query = "select userid, username, age from tbl_test";

        Connection con = null; // null 없이 con; 으로 끝내도 됨
        Statement stmt = null;
        ResultSet rs = null;

        Class.forName("org.mariadb.jdbc.Driver"); //jdbc 드라이버 읽어옴, 
        con = DriverManager.getConnection(url, userid, userpw); // "org.mariadb.jdbc.Driver" 해당 드라이버 안의 클래스, Connection사용 ?
        stmt = con.createStatement();
        rs = stmt.executeQuery(query); //db 상 쿼리를 실행시켜 값을 가져온다
        
        List <Member> list = new ArrayList<>();

        while(rs.next()){ //다음 레코드가 존재 하는가에 대한 true/false 출력
            //list.add(new Member(rs.getString("userid"), rs.getString("username"), rs.getInt("age")));//new 키워드 뒤에는 생성자
            list.add(new Member.Builder()
                    .userid(rs.getString("userid"))
                    .username(rs.getString("username"))
                    .age(rs.getInt("age"))
                    .build()
                    );
        }

        for(Member member: list){ //member 객체 안에 list 값 넣어주고 getter 통해 private 변수 가져옴0
            System.out.println("ID : "+member.getUserid()+"\n"
                +"이름 : "+member.getUsername()+"\n"
                +"나이 : "+member.getAge());
        }
        
        if(rs != null) rs.close(); //? 통신 닫기?
        if(stmt != null) stmt.close();
        if(con != null) con.close();

    }//end of main
}
