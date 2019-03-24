package com.duder.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duder.mvc.models.Book;
import com.duder.mvc.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepo;
	public BookService(BookRepository repo) {
		this.bookRepo = repo;
	}
	
	public List<Book> allBooks() {
		return bookRepo.findAll();
	}
	
}
