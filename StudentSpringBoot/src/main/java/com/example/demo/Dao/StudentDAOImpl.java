package com.example.demo.Dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Student;

public class StudentDAOImpl implements StudentDAO{

	@Override
	public Student createStudent(Student student) {
		
		@Autowired
		private EntityManager entitymanager;
		
	}

}
