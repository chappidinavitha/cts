package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ToDo;
@Repository
@Transactional
public interface ToDoDAO extends JpaRepository<ToDo, Integer> {
     public List<ToDo> findBytodoName(String todoName);
}
