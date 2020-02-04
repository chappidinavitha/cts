package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ToDo;
import com.example.demo.service.ToDoService;

@RestController
@RequestMapping("/ToDos")
public class ToDoRestController {
	private ToDoService todoService;

	public ToDoRestController(ToDoService todoService) {
		super();
		this.todoService = todoService;
	}
	
		
	@GetMapping("/")
	public List<ToDo> getAllToDos()
	{
		return todoService.getAllToDos();
	}

}
