package com.codingdojo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;

@RestController
public class BooksApi {
//	private final BookService bookService;
//	public BooksApi(BookService service) {
//		this.bookService = service;
//	}
//	@RequestMapping("/api/books")
//	public List<Book> Index() {
//		return bookService.allBooks();
//	}
//	@RequestMapping(value="/api/books", method=RequestMethod.POST)
//	public Book create(@RequestParam(value="title") String title, 
//			@RequestParam(value="description") String description,
//			@RequestParam(value="language") String language,
//			@RequestParam(value="numPages") Integer numPages) {
//		return bookService.createBook(new Book(title, description, language, numPages));
//	}
//	@RequestMapping("/api/books/{id}")
//	public Book Show(@PathVariable("id") Long id) {
//		return bookService.findBook(id);
//	}
}
