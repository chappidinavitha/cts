package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.ItemRepository;

@SpringBootApplication
public class MongodbApplication implements CommandLineRunner{
	private ItemRepository itemrepo;
	
@Autowired
	public MongodbApplication(ItemRepository itemrepo) {
		super();
		this.itemrepo = itemrepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}
	

}
