package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Item;
import com.example.demo.repo.ItemRepository;
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
    private ItemRepository itemrepo;
    
	

	@Override
	@Transactional
	public List<Item> getAllItems() {
		
		return itemrepo.findAll();
	}

	@Override
	@Transactional
	public Item createItem(Item item) {
		return itemrepo.insert(item);
	}

	@Override
	public Optional<Item> findById(String itemId) {
		
		return itemrepo.findById(itemId);
	}

	@Override
	public List<Item> findItemByName(String itemName) {
		
		return itemrepo.findByItemName(itemName);
	}

	@Override
	public void deleteById(String itemId) {
		itemrepo.deleteById(itemId);
		
	}

	@Override
	public void deleteAllItems() {
	itemrepo.deleteAll();
		
	}


	
	

}
