package com.ysu.hotel.dao;

import com.ysu.hotel.entity.User;

import java.sql.SQLException;

/**
 * 用户表
 */
public interface UserDao {
	User findById(Integer id) throws SQLException;
}
