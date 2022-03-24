package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Member {

    private String userid;
    private String username;
    private int age;

    Member(String userid, String username, int age){
        this.userid = userid;
        this.username = username;
        this.age = age;
    }

    public String getUserid() {
        return userid;
    }
    public String getUsername() {
        return username;
    }
    public int getAge() {
        return age;
    }

}

public class jdbc {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        String url = "jdbc:mariadb://127.0.0.1:3306/webdev";
        String userid = "webmaster";
        String userpw = "134625";
        String query = "select userid, username, age from tbl_test";

        //jdbc와 연결해서 sql문 실행
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        //jdbc와 연결해서 sql문 실행

        Class.forName("org.mariadb.jdbc");//jdbc 드라이버 읽어옴
        con = DriverManager.getConnection(url, userid, userpw);
        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        List <Member> list  = new ArrayList(); //

    }

}
