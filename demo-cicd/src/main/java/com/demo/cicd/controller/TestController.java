package com.demo.cicd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.cicd.model.Book;
import com.demo.cicd.repo.BookRepo;

@RestController
public class TestController {
	
	@Autowired
	public BookRepo bookRepo;
	
	
	@GetMapping("/test")
	public String getBooks() {
		List<Book> book = bookRepo.findAll();
		return book.toString();
	}
	
	@PostMapping("/test")
	public String postBooks() {
		Book book = new Book();
		book.setName("The book");
		book.setAuther("Shivank singh");
		book.setPages(23);
		book.setRating((float) 4);
		book = bookRepo.save(book);
		return book.toString();
	}

}
