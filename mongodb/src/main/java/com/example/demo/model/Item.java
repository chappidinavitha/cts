package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Item {
@Id
private String itemId;
private String itemName;
private String itemPrice;
public Item(String itemId, String itemName, String itemPrice) {
	super();
	this.itemId = itemId;
	this.itemName = itemName;
	this.itemPrice = itemPrice;
}

}
