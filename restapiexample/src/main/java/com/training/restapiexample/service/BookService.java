package com.training.restapiexample.service;

import java.util.List;

import com.training.restapiexample.entities.Book;
import com.training.restapiexample.exceptions.NoBookFoundException;

public interface BookService {
	//Create
		public Book addBook(Book book);
		//Retrieve
		public Book retrieveBook(Integer bookId) throws NoBookFoundException;
		//Delete
		public String deleteBook(Integer bookId);
		
		//Update
		public String updateBoook(Book book);
		//Retrieve all books
		public List<Book> getAllBooks();
}
