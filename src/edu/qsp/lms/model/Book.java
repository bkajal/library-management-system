/**
 * A Library Management System made using the concepts of Object Oriented Programming Principles and 
Model-View-Controller Architecture. Minimal Code is written in the GUI. The interface is console based. 
This project was designed during the course at QSP.
 * <p>
 * Library Management system uses MVC architecture where Model contains classes and methods
 * <p>
 * Book Model handles methods related to Book Class
 */
package edu.qsp.lms.model;
/**
 * Book has controlled access for bookName bookAuther bookPrice publication
 * @author KAJAL
 *
 */
public class Book {
	private String bookName;
	private String bookAuther;
	private double bookPrice;
	private String publication;
	/**
	 * getBookName method 
	 * @return bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * setBookName method gets current bookName
	 * @param bookName  String userInput entity
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * getBookAuther method gets bookAuther
	 * @return bookAuther
	 */
	public String getBookAuther() {
		return bookAuther;
	}
	/**
	 * setBookAuther method sets current bookAuther
	 * @param bookAuther   String userInput entity
	 */
	public void setBookAuther(String bookAuther) {
		this.bookAuther = bookAuther;
	}
	/**
	 * getBookPrice method gets bookPrice
	 * @return bookPrice
	 */
	public double getBookPrice() {
		return bookPrice;
	}
	/**
	 * setBookPrice method sets bookPrice
	 * @param bookPrice  double userInput entity
	 */
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	/**
	 * getPublication method gets publication
	 * @return publication 
	 */
	public String getPublication() {
		return publication;
	}
	/**
	 * setPublication method sets current publication
	 * @param publication
	 */
	public void setPublication(String publication) {
		this.publication = publication;
	}
	/**
	 * toString method overrides to compare data rather than address of String
	 */
	@Override
	public String toString() {
		return "[bookName=" + bookName + ", bookAuther=" + bookAuther + ", bookPrice=" + bookPrice + ", publication=" + publication + "]";
	}

}
