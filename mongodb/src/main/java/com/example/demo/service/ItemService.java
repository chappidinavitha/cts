package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Item;

public interface ItemService {
	public List<Item> getAllItems();
	public Item createItem(Item item);

}
