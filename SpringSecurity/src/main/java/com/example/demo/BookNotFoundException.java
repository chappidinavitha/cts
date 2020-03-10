package com.example.demo;

public class BookNotFoundException extends RuntimeException {
	public BookNotFoundException(Long id) {
        super("Book id not found : " + id);
    }
	
}
