/**
 * A Library Management System made using the concepts of Object Oriented Programming Principles and 
Model-View-Controller Architecture. Minimal Code is written in the GUI. The interface is console based. 
This project was designed during the course at QSP.
 * <p>
 * Library Management system uses MVC architecture where Model contains classes and methods for real world entities.
 * <p>
 * Library Model handles methods related to Library Class
 */
package edu.qsp.lms.model;

import java.util.List;
/**
 * Library has controlled access for libraryName libraryAddress PIN ListofBooks
 * @author KAJAL
 *
 */
public class Library {
	private String libraryName;
	private String libraryAddress;
	private int pincode;
	private List<Book> books;
	/**
	 * getLibraryName method gets libraryName
	 * @return libraryName
	 */
	public String getLibraryName() {
		return libraryName;
	}
	/**
	 * setLibraryName method sets current libraryName
	 * @param libraryName    String libraryName
	 */
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	/**
	 * getLibraryAddress method gets library Address
	 * @return libraryAddress
	 */
	public String getLibraryAddress() {
		return libraryAddress;
	}
	/**
	 * setLibraryAddress method sets current libraryAddress
	 * @param libraryAddress    String libraryAddress
	 */
	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}
	/**
	 * getPincode method gets pin code
	 * @return pin code
	 */
	public int getPincode() {
		return pincode;
	}
	/**
	 * setPincode method sets current pin code
	 * @param pincode   Integer value
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	/**
	 * List collection is used to store books. getBooks method gets list of all books.
	 * @return list of books
	 */
	public List<Book> getBooks() {
		return books;
	}
	/**
	 * setBooks method sets current book list
	 * @param books   List of books
	 */
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	/**
	 * toString method overrides to compare data rather than address of String
	 */
	@Override
	public String toString() {
		return "[libraryName=" + libraryName + ", libraryAddress=" + libraryAddress + ", pincode=" + pincode + "]";
	}
	

}
