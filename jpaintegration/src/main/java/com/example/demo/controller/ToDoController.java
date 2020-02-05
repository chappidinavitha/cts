package com.example.demo.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.error.ToDoNotFoundException;
import com.example.demo.error.Errormessage;

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
    @ExceptionHandler
    public ResponseEntity<Errormessage> handleError1(ToDoNotFoundException bne)
    {
    	Errormessage err=new Errormessage();
    	err.setMessage(bne.getMessage());
    	err.setStatus(HttpStatus.NOT_FOUND.value());
    	err.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<Errormessage>(err,HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public ResponseEntity<Errormessage> handleError2(Exception e)
    {
    	Errormessage err=new Errormessage();
    	err.setMessage(e.getMessage());
    	err.setStatus(HttpStatus.BAD_REQUEST.value());
    	err.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<Errormessage>(err,HttpStatus.BAD_REQUEST);
    }
    @GetMapping("/todos")
    public List<ToDo> getAllToDos()
    {
    	return todoService.getAllToDos();
    }
    @GetMapping("/todos/{todoId}")
    public Optional<ToDo> getTodoById(@PathVariable Integer todoId)throws Exception
    {
    	Optional<ToDo> book=todoService.getTodoById(todoId);
		if(!book.isPresent())
		{
			throw new ToDoNotFoundException("todo not found with id: "+todoId);
		}
		
		return book; 
	}
    @PostMapping("/todos")
    public ToDo createToDo(@RequestBody ToDo todo)
    {
    	todo.setTodoId(0);
		return todoService.createtoDo(todo);
    	
    }

		
    	
    }
	


