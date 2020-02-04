package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ToDoDAO;
import com.example.demo.model.ToDo;

@SpringBootApplication
public class JpaintegrationApplication implements CommandLineRunner{
	private ToDoDAO todoDao;
	
@Autowired
	public JpaintegrationApplication(ToDoDAO todoDao) {
		super();
		this.todoDao = todoDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaintegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoDao.save(new ToDo(100,"navitha"));
		todoDao.save(new ToDo(101,"navitha1"));
		
	}

}
