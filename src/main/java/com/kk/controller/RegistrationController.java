package com.kk.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import com.kk.entity.User;
import com.kk.service.UserService;
import com.kk.service.UserServiceImpl;

@Controller
public class RegistrationController extends HttpServlet {

	public UserService userService = new UserServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/register.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUsername(req.getParameter("username"));
		user.setPassword(req.getParameter("password"));
		user.setFirstname(req.getParameter("firstname"));
		user.setLastname(req.getParameter("lastname"));
		user.setEmail(req.getParameter("email"));
		user.setPhone(req.getParameter("phone"));
		user.setAddress(req.getParameter("address"));
		user.setRole(req.getParameter("password"));

		userService.register(user);
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/welcome.jsp");
		rd.forward(req, resp);
	}
	//
	// @RequestMapping(value = "/register", method = RequestMethod.GET)
	// public ModelAndView showRegister(HttpServletRequest request,
	// HttpServletResponse response) {
	// ModelAndView mav = new ModelAndView("register");
	// mav.addObject("user", new User());
	// return mav;
	// }
	//
	// @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	// public ModelAndView addUser(HttpServletRequest request,
	// HttpServletResponse response,
	// @ModelAttribute("user") User user) {
	// return new ModelAndView("welcome", "firstname", user.getFirstname());
	// }
}
