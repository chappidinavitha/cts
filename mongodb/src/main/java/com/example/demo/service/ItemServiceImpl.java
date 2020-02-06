package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Item;
import com.example.demo.repo.ItemRepository;
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
    private ItemRepository itemrepo;
    
	public ItemServiceImpl(ItemRepository itemrepo) {
		super();
		this.itemrepo = itemrepo;
	}

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

}
