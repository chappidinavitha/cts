package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.ToDo;

public interface ToDoService {
	public List<ToDo> getAllToDos();
	public Optional<ToDo> getTodoById(Integer todoId);
	public ToDo createtoDo(ToDo todo);
	public void deletetoDoById(Integer todoId);
	public void deleteAll();
	 public List<ToDo> findBytodoName(String todoName);
	 
	

}
