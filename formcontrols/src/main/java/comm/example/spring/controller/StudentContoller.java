package comm.example.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/student")
public class StudentContoller {
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		
		Student theStudent = new Student();
		
		
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/processForm")
	public String processForm(@Valid@ModelAttribute("student") Student theStudent,BindingResult theResult) {
		
		
		System.out.println("theStudent: " + theStudent.getFirstName()
							+ " " + theStudent.getLastName());
		
		if(theResult.hasErrors())
		{
			return "student-form";
		}
		else
		{
		return "student-confirmation";
		}
	}
	
}




