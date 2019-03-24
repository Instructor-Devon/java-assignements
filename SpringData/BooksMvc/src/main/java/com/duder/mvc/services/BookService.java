package com.duder.mvc.services;

import java.util.List;
import java.util.Optional;

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
	
	public Book findBook(Long id) {
		return bookRepo.findById(id).orElse(null);
	}
	public Book createBook(Book newBook) {
		return bookRepo.save(newBook);
	}
	public Book updateBook(Long id, String title, String description,
			String language, int numPages) {
		Book toUpdate = bookRepo.findById(id).orElse(null);
		if(toUpdate == null) { return null;}
		toUpdate.setTitle(title);
		toUpdate.setDescription(description);
		toUpdate.setLanguage(language);
		toUpdate.setNumberOfPages(numPages);
		return bookRepo.save(toUpdate);
	}
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
	
}
