package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "show-form";
	}
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request,Model model) {
		String sName=request.getParameter("sName");
		String lName=request.getParameter("lName");
		String email=request.getParameter("email");
		model.addAttribute("message",sName);
		model.addAttribute("message",lName);
		model.addAttribute("message",email);
		return "process-form";
		
	}

}
