package com.training.restapiexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.restapiexample.entities.Book;
import com.training.restapiexample.exceptions.NoBookFoundException;
import com.training.restapiexample.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public Book addBook(Book book) {

		return bookRepository.save(book);
	}

	@Override
	public Book retrieveBook(Integer bookId) throws NoBookFoundException{
		Optional<Book> book = bookRepository.findById(bookId);
		if (book.isPresent()) {
			return book.get();
		} else {
			throw new NoBookFoundException("Unable to get Book with bookid"+bookId);
		}

	}

	@Override
	public String deleteBook(Integer bookId) {
		bookRepository.deleteById(bookId);
		return "Book with bookId ---" + bookId + "  deleted successfully";
	}

	@Override
	public String updateBoook(Book book) {
		Optional<Book> bok = bookRepository.findById(book.getBookId());
		if (bok.isPresent()) {
			Book bk = bookRepository.save(book);
			if (bk != null) {
				return "Book entity updated successfully";
			} else {
				return "Book entity not updated successfully";
			}
		} else {
			return "Book with bookId ---" + book.getBookId() + "  cannot be update as it doesn't exists";
		}

	}

	@Override
	public List<Book> getAllBooks() {
		
		return (List<Book>) bookRepository.findAll();
	}

}