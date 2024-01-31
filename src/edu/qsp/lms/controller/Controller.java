/**
 * A Library Management System made using the concepts of Object Oriented Programming Principles and 
Model-View-Controller Architecture. Minimal Code is written in the GUI. The interface is console based. 
This project was designed during the course at QSP.
 * <p>
 * Library Management system uses MVC architecture where controller contains business logic of LMS
 */
package edu.qsp.lms.controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Iterator;

import edu.qsp.lms.model.Book;
import edu.qsp.lms.model.Library;

/**
 * Library has controlled access to addBook searchBook removeBook updateBookByBookName
 * @author KAJAL
 *
 */
public class Controller {
	/**
	 * Library stores and controls Book Operations 
	 */
	private Library library = new Library();
	/**
	 * addBook method uses List collection to add new book. ArrayList implementing class stores books
	 * @param book    new userInput entity
	 */
	public void addBook(Book book){
		List<Book> books = library.getBooks();
		if (books==null) {
			books=new ArrayList<>();
			library.setBooks(books);
		}
		books.add(book);
	}
	/**
	 * searchBook searches the required book by bookName from List collection using Iterator Interface
	 * @param bookName   String userInput entity
	 * @return book
	 */
	public Book searchBook(String bookName) {
		List<Book> books = library.getBooks();
		
		Iterator<Book> iterator = books.iterator();

		while (iterator.hasNext()) {
			Book book = iterator.next();
			if(book.getBookName().equalsIgnoreCase(bookName))
			{
				return book;
			}
		}
		return null;
	}
	/**
	 * removeBook method deletes book object by using searchBook method
	 * @param bookName   String userInput entity
	 * @return boolean value
	 */
	public boolean removeBook(String bookName) {
		Book book = searchBook(bookName);
		if(book!=null)
		{
			List<Book> books = library.getBooks();
			books.remove(book);
			return true;
		}
		return false;
	}
	/**
	 * updateBookPriceByBookName modifies book price from user using refBook with the help of searchBook method
	 * @param refBook   String and double userInput entity
	 * @return boolean value
	 */
	public boolean updateBookPriceByBookName(Book refBook)
	{
		Book book = searchBook(refBook.getBookName());
		if(book!=null)
		{
			book.setBookPrice(refBook.getBookPrice());
			return true;
		}
		return false;
	}
	/**
	 * getAllBooks method gives all the details of books present in List
	 * @return List collection of Book
	 */
	public List<Book> getAllBooks() {
		return library.getBooks();
	}
}
