package comm.example.spring.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import comm.example.spring.model.CdType;

@Controller
@RequestMapping("/CdType")
public class CdTypeController {
	@RequestMapping("/showForm")
	public String showFormForAdd()
	{
		return "list_cdtypes";
	}
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("title") String title,
			@RequestParam("type") String type,
			@RequestParam("date") String date,Model theModel)
	{
		
		CdType cd=new CdType(title, type, date);
		theModel.addAttribute("CdType",cd);
		
		return "success";
	}

}
