package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ToDoDAO;
import com.example.demo.model.ToDo;
@Service

public class ToDoServiceImpl implements ToDoService{
	private ToDoDAO tododao;
	@Autowired
		public ToDoServiceImpl(ToDoDAO tododao) {
		super();
		this.tododao = tododao;
	}

@Override
	public List<ToDo> getAllToDos() {
		// TODO Auto-generated method stub
		return tododao.getAllToDos();
	}

}
