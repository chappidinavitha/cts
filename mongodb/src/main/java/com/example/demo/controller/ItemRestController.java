package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;

import com.example.demo.service.ItemService;
@RestController
@RequestMapping("/api")
public class ItemRestController {
	private ItemService itemservice;

	
@Autowired
public ItemRestController(ItemService itemservice) {
		super();
		this.itemservice = itemservice;
	}
@GetMapping("/items")
public List<Item> getAllItem()
{
	return itemservice.getAllItems();
	
}
@PostMapping("/items")
public Item createItem(@RequestBody Item item)
{
	return itemservice.createItem(item);
	
}
@GetMapping("/items/{itemId}")
public Optional<Item> findItemById(@PathVariable String itemId){

	return itemservice.findById(itemId);
	
}
@GetMapping("/items/findbyname/{itemName}")
public List<Item> findItemByName(@PathVariable String itemName) {
	return itemservice.findItemByName(itemName);
}
@PutMapping("/items")
public Item updateItem(@RequestBody Item item)
{
	return itemservice.createItem(item);
}
@DeleteMapping("/items/{itemId}")
public void deleteById(String itemId)
{
	itemservice.deleteById(itemId);
}
@DeleteMapping("/items")
public void deleteAllItems()
{
	itemservice.deleteAllItems();
}
 
}
