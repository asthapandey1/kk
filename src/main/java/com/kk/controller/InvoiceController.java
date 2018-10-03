package com.kk.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import com.kk.entity.Invoice;
import com.kk.pdf.PdfGenerator;
import com.kk.service.UserService;
import com.kk.service.UserServiceImpl;

@Controller
public class InvoiceController extends HttpServlet {

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

		resp.setContentType("application/pdf;charset=UTF-8");
		Invoice invoice = new Invoice();
		invoice.setUsername(req.getParameter("username"));
		invoice.setProductName(req.getParameter("productName"));
		invoice.setPrice(Double.parseDouble(req.getParameter("price")));
		invoice.setEmailId(req.getParameter("email"));
		invoice.setPhoneNumber(req.getParameter("phone"));
		invoice.setAddress(req.getParameter("address"));

		resp.addHeader("Content-Disposition", "inline; filename=" + "cities.pdf");
		ServletOutputStream out = resp.getOutputStream();

		ByteArrayOutputStream baos = PdfGenerator.getInvoice(invoice);
		baos.writeTo(out);
	}
}
