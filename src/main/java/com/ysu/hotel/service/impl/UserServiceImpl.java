package com.ysu.hotel.service.impl;

import com.ysu.hotel.dao.UserDao;
import com.ysu.hotel.dao.impl.UserDaoImpl;
import com.ysu.hotel.entity.User;
import com.ysu.hotel.service.UserService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class UserServiceImpl  implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public User findById() {
        User user = null;
        try {
            user = userDao.findById(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}