package com.example.view;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.model.Customer;
import comm.service.CustomerService;
import comm.service.CustomerServiceImpl;


public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private CustomerService service;

	@Override
	public void init() throws ServletException {

		super.init();
		service=new CustomerServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);

}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fName=request.getParameter("fName");
		String lName=request.getParameter("lName");
		String email=request.getParameter("email");
	
		Customer dto=new Customer(fName, lName, email);
		Customer customer=service.createCustomer(dto);
		if(customer!=null)
		{
			request.setAttribute("SUCCESS", customer);
			RequestDispatcher view=request.getRequestDispatcher("success.view");
			view.forward(request, response);
		}
		else
		{
			RequestDispatcher view=request.getRequestDispatcher("error.html");
			view.forward(request, response);
		}
	}

}


