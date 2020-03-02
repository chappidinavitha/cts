package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class ProxyController {
	@Autowired
	private UserServiceClient userService;
	@RequestMapping("/groups")
	public List<Groups> getAllGroups(){
		
		return userService.getAllGroups();
	}

}
