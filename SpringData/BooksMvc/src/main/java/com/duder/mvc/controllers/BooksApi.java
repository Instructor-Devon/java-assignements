package com.duder.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duder.mvc.models.Book;
import com.duder.mvc.services.BookService;

@RestController
public class BooksApi {
	private final BookService bookService;
	public BooksApi(BookService service) {
		this.bookService = service;
	}
	
	@RequestMapping("/api/books")
	public List<Book> Boner() {
		return bookService.allBooks();
	}
}
