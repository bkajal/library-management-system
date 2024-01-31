/** 
 * A Library Management System made using the concepts of Object Oriented Programming Principles and 
Model-View-Controller Architecture. Minimal Code is written in the GUI. The interface is console based. 
This project was designed during the course at QSP.
 * <p>
 * Library Management system uses MVC architecture where view handles userInput for entities and Display output.
 */

package edu.qsp.lms.view;

import java.util.List;
import java.util.Scanner;

import edu.qsp.lms.controller.Controller;
import edu.qsp.lms.model.Book;
import edu.qsp.lms.model.Library;
/**
 * Menu Driven Library Management System to give interactive console for CRUD operations
 * @author KAJAL
 *
 */
public class View {
	/**
	 * static block does static initialization of a class. 
	 * static block loaded automatically once class is loaded in memory.
	 */
	static Scanner myInput = new Scanner(System.in);
	static Library library = new Library();
	static Controller controller = new Controller();
	static {
		System.out.println(" ------------------------------------------ ");
		System.out.println("| --WELCOME TO LIBRARY MANAGEMENT SYSTEM-- |");
		System.out.println(" ------------------------------------------ ");
		System.out.print("ENTER NAME OF LIBRARY : ");
		String libraryName = myInput.nextLine();
		library.setLibraryName(libraryName);
		System.out.print("Enter address of library : ");
		String libraryAddress = myInput.nextLine();
		library.setLibraryAddress(libraryAddress);
		System.out.print("Enter the pincode : ");
		int libraryPincode = myInput.nextInt();
		myInput.nextLine();		
		library.setPincode(libraryPincode);
		
	}
	/**
	 * main method loads the program to JVM
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * do-while performs while condition is true. 
		 * Switch is used for Menu Driven Options according to userInput
		 */
		do {
			System.out.println(" ------------------------------------------ ");
			System.out.println("\nSelect operation to perform : ");
			System.out.println("1.Add book\n2.Remove Book\n3.Update Book\n4.Get book by name\n5.Get all books\n0.Exit");
			System.out.print("Enter digit respective to desired option : ");
			int userchoice = myInput.nextInt();
			myInput.nextLine();
			switch(userchoice)
			{
			case 0:
					myInput.close();
					System.out.println(" ----------- ");
					System.out.println("| --EXITED-- |");
					System.out.println(" ----------- ");
					System.exit(0);
					break;
			case 1:
				//Add Book
					Book book1 = new Book();
					System.out.print("Enter book name : ");
					book1.setBookName(myInput.nextLine());
					System.out.print("Enter book Author : ");
					book1.setBookAuther(myInput.nextLine());
					System.out.print("Enter book Price : ");
					book1.setBookPrice(myInput.nextDouble());
					myInput.nextLine();
					System.out.print("Enter publication : ");
					book1.setPublication(myInput.nextLine());
					//
					controller.addBook(book1);
					break;
			case 2:
				//Remove Book
					System.out.println("Enter name of book to be removed : ");
					String bookToBeRemoved = myInput.nextLine();
					boolean verifyRemoveBook = controller.removeBook(bookToBeRemoved);
					if(verifyRemoveBook)
					{
						System.out.println(" ------------------ ");
						System.out.println("| --Book Removed-- |");
						System.out.println(" ------------------ ");
					}
					else
					{
						System.out.println(" ----------------------------------- ");
						System.out.println("| --Book does not exit in Library-- |");
						System.out.println(" ----------------------------------- ");
					}
					break;
			case 3:
				//Update Book
					Book book3 = new Book();
					System.out.println("Enter name of book to be updated : ");
					String bookToUpdate = myInput.nextLine();
					book3.setBookName(bookToUpdate);
					System.out.println(" Enter Price of book to be updated : ");
					double newPrice = myInput.nextDouble();
					//
					myInput.nextLine();
					book3.setBookPrice(newPrice);
					//
					if(controller.updateBookPriceByBookName(book3))
					{
						System.out.println(" ------------------------ ");
						System.out.println("| --Book Price Updated-- |");
						System.out.println(" ------------------------ ");
					}
					else
					{
						System.out.println(" ----------------------------------- ");
						System.out.println("| --Book does not exit in Library-- |");
						System.out.println(" ----------------------------------- ");
					}
					break;
			case 4:
				//Get book by Name
					System.out.println("Enter book name : ");
					String bookToGet = myInput.nextLine();
					//searchbook
					Book book = controller.searchBook(bookToGet);
					//verification
					if(book != null)
					{
						System.out.println(book);
					}
					else
					{
						System.out.println(" ----------------------------------- ");
						System.out.println("| --Book does not exit in Library-- |");
						System.out.println(" ----------------------------------- ");
					}
					break;
			case 5:
				//Get all Books
				List<Book> allBooks = controller.getAllBooks();
					if (allBooks!=null) {
						for (Book e_book : allBooks) {
							System.out.println(e_book +" ");
						}
					} else {
						System.out.println(" --------------------------------- ");
						System.out.println("|    --No Book in the Library--   |");
						System.out.println("| --Add New Book in the Library-- |");
						System.out.println(" --------------------------------- ");
					}
				
					break;
			default:
					System.out.println(" ------------------------------- ");
					System.out.println("| --PLEASE ENTER VALID CHOICE-- |");
					System.out.println(" ------------------------------- ");
					break;
			}
		}
		while(true);
	}

}
