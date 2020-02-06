package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.repo.ItemRepository;
@RestController
@RequestMapping("/api")
public class ItemRestController {
 private ItemRepository itemrepo;
@Autowired
public ItemRestController(ItemRepository itemrepo) {
	super();
	this.itemrepo = itemrepo;
}
@GetMapping("/items")
public List<Item> getAllItem()
{
	return itemrepo.findAll();
	
}
@PostMapping("/items")
public Item createItem(@RequestBody Item item)
{
	return itemrepo.insert(item);
	
}
 
}
