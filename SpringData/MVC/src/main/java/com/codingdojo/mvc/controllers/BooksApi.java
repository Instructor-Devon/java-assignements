package com.codingdojo.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;

@RestController
public class BooksApi {
	private final BookService bookService;
	public BooksApi(BookService service) {
		this.bookService = service;
	}
	@RequestMapping("/")
	public List<Book> Index() {
		return bookService.allBooks();
	}
}
