package com.kk.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import com.kk.entity.Login;
import com.kk.entity.User;
import com.kk.service.UserService;
import com.kk.service.UserServiceImpl;

@Controller
public class LoginController extends HttpServlet {
	UserService userService = new UserServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/login.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Login login = new Login();
		login.setUsername(req.getParameter("username"));
		login.setPassword(req.getParameter("password"));
		User user = userService.validateUser(login);
		if (null != user) {
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/welcome.jsp");
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/login.jsp");
			rd.forward(req, resp);
		}
	}
}