package com.ysu.hotel.dao.impl;

import com.ysu.hotel.dao.UserDao;
import com.ysu.hotel.entity.User;
import com.ysu.hotel.util.JdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author lixuhui
 * @date 2020/6/18
 */
public class UserDaoImpl implements UserDao {
    @Override
    public User findById(Integer id) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user where id = 1");
        User user = new User();
        while (resultSet.next()) {
            user.setId(resultSet.getInt("id"));
            user.setLogin(resultSet.getString("login"));
            user.setName(resultSet.getString("name"));
            user.setPassword(resultSet.getString("password"));
            user.setNote(resultSet.getString("note"));
            user.setPermissions(resultSet.getInt("permissions"));
        }
        return user;
    }
}
