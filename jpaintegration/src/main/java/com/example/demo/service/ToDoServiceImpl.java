package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.ToDoDAO;
import com.example.demo.model.ToDo;
@Service
@EnableTransactionManagement
public class ToDoServiceImpl implements ToDoService{
	private ToDoDAO todoDao;
	
@Autowired
	public ToDoServiceImpl(ToDoDAO todoDao) {
		super();
		this.todoDao = todoDao;
	}

	@Override
	@Transactional
	public List<ToDo> getAllToDos() {
		
		return todoDao.findAll();
	}

	@Override
	@Transactional
	public Optional<ToDo> getTodoById(Integer todoId) {
		Optional<ToDo> todo=todoDao.findById(todoId);
		return todo;
	}

	@Override
	public ToDo createtoDo(ToDo todo) {
		
		return todoDao.save(todo);
	}

	@Override
	public void deletetoDoById(Integer todoId) {
		todoDao.deleteById(todoId);
		
	}

	@Override
	public void deleteAll() {
		todoDao.deleteAll();
		
	}
    
	@Override
	public List<ToDo> findBytodoName(String todoName) {
		
		return todoDao.findBytodoName(todoName);
	}

	

}
