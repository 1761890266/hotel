package com.ysu.hotel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author lixuhui
 * @date 2020/6/18
 */
public class JdbcUtil {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?uesTimezone=false&serverTimezone=&useUnicode=true&characterEncoding=utf8&useSSL=false",
                "root",
                "root");
    }
}
