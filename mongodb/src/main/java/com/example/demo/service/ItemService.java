package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Item;

public interface ItemService {
	public List<Item> getAllItems();
	public Item createItem(Item item);
    public Optional<Item> findById(String itemId);
    public List<Item> findItemByName(String itemName);
    public void deleteById(String itemId);
    public void deleteAllItems();
    
}
