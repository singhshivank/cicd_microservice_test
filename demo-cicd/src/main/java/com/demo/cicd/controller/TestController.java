package com.demo.cicd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.cicd.model.Book;
import com.demo.cicd.repo.BookRepo;

import org.springframework.http.ResponseEntity;


@RestController
public class TestController {
	
	@Autowired
	public BookRepo bookRepo;
	
	
	@GetMapping("/test")
	public ResponseEntity<List<Book>> getBooks() {
		List<Book> books = bookRepo.findAll();
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
	
	@PostMapping("/test")
	public ResponseEntity<Book>  postBooks() {
		Book book = new Book();
		book.setName("The book");
		book.setAuther("Shivank singh");
		book.setPages(23);
		book.setRating((float) 4);
		book = bookRepo.save(book);
		return new ResponseEntity<>(book, HttpStatus.OK);
	}

}
