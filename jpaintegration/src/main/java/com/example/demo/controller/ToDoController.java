package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ToDo;
import com.example.demo.service.ToDoService;
@RestController
@RequestMapping("/api")
public class ToDoController {
	private ToDoService todoService;
    @Autowired
	public ToDoController(ToDoService todoService) {
		super();
		this.todoService = todoService;
	}
    public List<ToDo> getAllToDos()
    {
    	return todoService.getAllToDos();
    }
    public Optional<ToDo> getTodoById(@PathVariable Integer todoId)
    {
		return todoService.getTodoById(todoId);
    	
    }
	

}
