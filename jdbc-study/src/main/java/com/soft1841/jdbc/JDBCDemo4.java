package com.soft1841.jdbc;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * JDBC删除数据
 */

public class JDBCDemo4 {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/db_jdbc?useUnicode=true&characterEncoding=utf8";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        System.out.println("连接数据库---");
        Connection conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
        String sql = "DELETE FROM t_student WHERE id = ?";
        System.out.println("实例化PreparedStatement对象----");
        PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
        //此处设置需要删除的那条记录的id
        pstmt.setInt(1,3);
        int n = pstmt.executeUpdate();
        System.out.println(n + "行记录受影响");
        pstmt.close();
        conn.close();
    }
}
