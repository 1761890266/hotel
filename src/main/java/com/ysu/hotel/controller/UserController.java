package com.ysu.hotel.controller;

import java.io.IOException;

import com.ysu.hotel.entity.User;
import com.ysu.hotel.service.UserService;
import com.ysu.hotel.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 用户表
 */
@WebServlet("/user")
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserService userService = new UserServiceImpl();
        User user = userService.findById();
        resp.getWriter().println(user.toString());
    }
}
