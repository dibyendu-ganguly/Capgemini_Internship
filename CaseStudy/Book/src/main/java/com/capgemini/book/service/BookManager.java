/**
 * 
 */
package com.capgemini.book.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.book.exceptions.ArrayListNullException;
import com.capgemini.book.exceptions.BookAlreadyFoundException;
import com.capgemini.book.exceptions.BookIdAlreadyExistsException;
import com.capgemini.book.exceptions.BookIdNegativeException;
import com.capgemini.book.exceptions.BookIdNotNextIdException;
import com.capgemini.book.exceptions.BookNameFormatInvalidException;
import com.capgemini.book.exceptions.BookNameNullException;
import com.capgemini.book.exceptions.BookNotFoundException;
import com.capgemini.book.exceptions.PriceNotValidException;
import com.capgemini.book.model.Book;


/**
 * @author DIBYENDU
 *
 */
public class BookManager {
	//int createConfirmFlag=0;
	Scanner sc = new Scanner(System.in);
	ArrayList<Book> bookList = new ArrayList<Book>();
	Map<String, Book> bookMap=new ConcurrentHashMap<String, Book>();
	
	int nextid=0;

	public void addBook(int id,String name,int price){
		Book book = new Book(id,name,price);
		
		//validateBook(id,name,price);
		try {
			checkIfBookAlreadyExist(book);
			bookList.add(book);
			bookMap.put(generateKey(book), book);
			//@SuppressWarnings("unused")
			//String addBookConfirmationString = "Book [id=" + id + ", Name=" + name + ", Price=" + price + "]";
			nextid++;
		} catch (BookAlreadyFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			//e.printStackTrace();
		}
		
	}
//	public String addBookConfirm(int id, String name, int price) {
//		return "Book [id=" + id + ", Name=" + name + ", Price=" + price + "]";
//	}
	
	
	/**
	 * generateKey method generates a key to store the value
	 */
	private String generateKey(Book book){
		return String.format("%s-%s",book.getBname(),book.getPrice());
	}



	/**
	 * method to validate book name
	 * @throws BookNameNullException if Book name is null 
	 * @throws BookNameFormatInvalidException if Book name contains any other character than alphanumeric characters and spaces
	 */
	public void validateBookName(String bookName) throws BookNameNullException, BookNameFormatInvalidException {
		// TODO Auto-generated method stub
		if(bookName == null || bookName.isEmpty() || bookName.trim().equals("") ){
			throw new BookNameNullException("BookNameNullException: Name cannot be null or empty");
		}
		else {
			String userNamePattern = "[A-Za-z0-9\s]*";
			Pattern pat=Pattern.compile(userNamePattern);
			Matcher matcher = pat.matcher(bookName);
			boolean username_result = matcher.matches();
			if(!username_result) {
				throw new BookNameFormatInvalidException("BookNameFormatInvalidException: Entered name does not follow the required format");
			}
			else
				System.out.println("Name is valid");
		}
	}
	/**
	 * method to validate Book Id
	 * @param bookId
	 * @throws BookIdNegativeException if book id is negative 
	 * @throws BookIdAlreadyExistsException 
	 * @throws BookIdNotNextIdException 
	 */
	public void validateBId(int bookId) throws BookIdNegativeException, BookIdAlreadyExistsException, BookIdNotNextIdException {
		if(bookId<0) {
			throw new BookIdNegativeException("BookIdNegativeException: Book Id cannot be nagative");
		}
		else if(bookId < nextid+1)
			throw new BookIdAlreadyExistsException("BookIdAlreadyExistsException: Book Id can not be duplicated, next Id should be "+(nextid+1));
		
		else if(bookId > nextid+1)
			throw new BookIdNotNextIdException("BookIdNotNextIdException: Entered Id is greater than next Book Id, next Id should be "+(nextid+1));
		
		
	}
	/**
	 * method to validate book price
	 * @param price
	 * @throws PriceNotValidException if book price is zero or negative
	 */
	public void validatePrice(int price) throws PriceNotValidException {
		if(price<=0) {
			throw new PriceNotValidException("PriceNotValidException: Price cannot be zero or negative");
		}
		else
			System.out.println("Price is valid");
	}
	
	/**
	 * method to check if a given book is already present in the bookList 
	 * @param book
	 * @throws BookAlreadyFoundException
	 */
	public void checkIfBookAlreadyExist(Book book) throws BookAlreadyFoundException{
		if(bookMap.containsKey(generateKey(book))){
			throw new BookAlreadyFoundException("BookAlreadyFoundException: Book Already Exists");
		}
	}

	/**
	 * 
	 * method to Display all values of bookList
	 * @throws ArrayListNullException 
	 */
	public void displayAllBooks() throws ArrayListNullException{
		if(bookList.isEmpty()) {
			throw new ArrayListNullException("ArrayListNullException: Book List is null");
		}else {
			Iterator<Book> bookItr = bookList.iterator();
			System.out.println("--------------------------------\n"
					+"| The Details of the Books | \n"
					+"--------------------------------");
			System.out.format("|%5s|%30s|%20s|\n","Id","Name","Price");
			System.out.println("=================================================================");
			while(bookItr.hasNext()) {
				Book ct = bookItr.next();
				System.out.format("|%5d|%30s|%20s|\n",ct.getBid(),ct.getBname(),ct.getPrice());
				System.out.println("--------------------------------------------------------------------");
			}
		}
	}
	
	/**
	 * method to return the ArrayList of books
	 * @return bookList 
	 */
	public ArrayList<Book> getAllBooks(){
		return bookList;
	}

	/**
	 * method to validate the book
	 * @param id
	 * @param name
	 * @param price
	 * @throws BookIdAlreadyExistsException 
	 * @throws BookIdNegativeException 
	 * @throws BookNameFormatInvalidException 
	 * @throws BookNameNullException 
	 * @throws PriceNotValidException 
	 * @throws BookIdNotNextIdException 
	 */
	public void validateBook(int id,String name,int price) throws BookIdNegativeException, BookIdAlreadyExistsException, BookNameNullException, BookNameFormatInvalidException, PriceNotValidException, BookIdNotNextIdException{
		validateBId(id);
		validateBookName(name);
		validatePrice(price);
		
	}
	
	/**
	 * method to read book name and validate that
	 * @return name of the book
	 */
	public String readName() {
		String name;
		do {
			try {
				System.out.println("Enter the name:");
				name = sc.nextLine();
				validateBookName(name);
			} catch (BookNameNullException | BookNameFormatInvalidException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				//e.printStackTrace();
				continue;
			}
		    break;
		} while (true);
		return name;
	}
	/**
	 * method to read book id as user Input and validate that
	 * @return id 
	 */
	public int readId() {
		int id=nextid;
		
		do {
			try {
				System.out.print("Enter the Id:");
				id = sc.nextInt();
				sc.nextLine();
				validateBId(id);
			} catch (BookIdNegativeException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				//e.printStackTrace();
				continue;
			} catch (BookIdAlreadyExistsException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				id=nextid+1; //if user input is wrong, it will automatically set the id to the next desired value; no need to continue;
				//e.printStackTrace();	
			} catch (InputMismatchException e) {
				System.out.println(e+": Please enter only an integer for Id");
				sc.next();
				//e.printStackTrace();
				continue;
			} catch (BookIdNotNextIdException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e);
				id=nextid+1;//if user input is wrong, it will automatically set the id to the next desired value; no need to continue;
				
			}
		    break;
		} while (true);
		return id;
	}
	/**
	 * method to read book price as user input and validate that
	 * @return the price
	 * @throws PriceNotValidException 
	 */
	public int readPrice(){
		int price;
		do {
			try {
				System.out.println("Enter the price:");
				price = sc.nextInt();
				sc.nextLine();
				validatePrice(price);
			} catch (PriceNotValidException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				//e.printStackTrace();
				continue;
			} catch (InputMismatchException e) {
				System.out.println(e+": Please enter only digits for price");
				sc.next();
				//e.printStackTrace();
				continue;
			}
		    break;
		} while (true);
		return price;
	}
	/**
	 * method to create the book by reading and validating the user inputs and then checking for duplicates and adding the book  
	 */
	public void create(){
		//int id = ++nextid;
		int id;
		String name;
		int price;
		
		id = readId();
		name = readName();
		price = readPrice();
		
		addBook(id, name, price);
		
	}
	
	/**
	 * method for displaying book details by Id
	 * @param id -> is for specifying book id
	 * @throws ArrayListNullException
	 * @throws BookNotFoundException
	 */
	public String displayBookById(int id) throws ArrayListNullException, BookNotFoundException {
		int flag = 0;
		if(bookList.isEmpty()) {
			throw new ArrayListNullException("ArrayListNullException: Book List is Null");
			
		}
		else {
			Iterator<Book> bookItr = bookList.iterator();
			while(bookItr.hasNext()) {
				Book ct = bookItr.next();
				//int id = readId();
				if(ct.getBid()==id) {
					System.out.println("--------------------------------\n"
							+"| The Details of the Book | \n"
							+"--------------------------------");
					System.out.format("|%5s|%30s|%20s|\n","Id","Name","Price");
					System.out.println("=================================================================");
					System.out.format("|%5d|%30s|%20s|\n",ct.getBid(),ct.getBname(),ct.getPrice());
					System.out.println("--------------------------------------------------------------------");
					flag = 1;				//if id is found flag set to 1
					return ct.getBname()+"-"+ct.getPrice();
				}		
			}
			
			//if flag is still 0, throw exception
			if(flag==0) {
				throw new BookNotFoundException("BookNotFoundException: Book with given Id is not found");
			}	
		}
		return null;	
	}
	
	
	/**
	 * method to delete book by Id
	 * @param id
	 * @throws ArrayListNullException if Book list is empty
	 * @throws BookNotFoundException if Book with given id is not present
	 */
	public void delBookById(int id) throws ArrayListNullException, BookNotFoundException {
		int flag = 0;
		if(bookList.isEmpty()) {
			throw new ArrayListNullException("ArrayListNullException: Book List is Null");
		}
		else {
			Iterator<Book> bookItr = bookList.iterator();
			while(bookItr.hasNext()) {
				Book ct = bookItr.next();
				if(ct.getBid()==id) {
					bookItr.remove();
					flag = 1;				//if id is found flag set to 1
				}		
			}
			//if flag is still 0, throw exception
			if(flag==0) {
				throw new BookNotFoundException("BookNotFoundException: Book with given Id is not found");
			}	
		}
	}
	/**
	 * method to get the book name for a given book
	 * @param book -> Book object
	 * @return book name
	 */
	public String getName(Book book) {
		return book.getBname();
	}
	/**
	 * method to get the book price for a given book
	 * @param book -> Book object
	 * @return book price
	 */
	public int getPrice(Book book) {
		return book.getPrice();
	}
	
	
	/**
	 * 
	 * @param id to select the book by id
	 * @param name -> name by which the old  name has to be replaced  
	 * @param nameUpdate -> String ; if 'yes' bookName has to be updated with @param name
	 * @param price -> price by which the old price has to be replaced
	 * @param priceUpdate -> String; if 'yes' bookPrice has to updated with @param 
	 * @throws ArrayListNullException if Book list is null
	 * @throws BookNotFoundException if Book with given id is not present
	 * 
	 */
	public Book updateBookById(int id, String name, String nameUpdate, int price, String priceUpdate) throws ArrayListNullException, BookNotFoundException {
		int flag = 0;
		if(bookList.isEmpty()) {
			throw new ArrayListNullException("ArrayListNullException: Book List is Null");
		}
		else {
			Iterator<Book> bookItr = bookList.iterator();
			while(bookItr.hasNext()) {
				Book ct = bookItr.next();
				if(ct.getBid()==id) {
					if(nameUpdate.equalsIgnoreCase("yes")) {
						ct.setBname(name);
					}
					if(priceUpdate.equalsIgnoreCase("yes")) {
						ct.setPrice(price);
					}
					flag = 1;				//if id is found flag set to 1
					return ct;
				}		
			}
			//if flag is still 0, throw exception
			if(flag==0) {
				throw new BookNotFoundException("BookNotFoundException: Book with given Id is not found");
			}
				
		}
		return null;	
	}
		

}
