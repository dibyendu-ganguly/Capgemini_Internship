/**
 * 
 */
package com.capgemini.book.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
class BookManagerTest {
	BookManager bm ;
	Book b;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Executed before all test cases\n---------------------\n");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("\n---------------------\nExecuted after all test cases");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("---Instantiating Book Manager---");
		bm= new BookManager();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("___Executed after each test case___");
		bm = null;
		b = null;				//garbage collector
	}

	@Test
	@DisplayName("Test to Create Book")
	void testBookCreate() {
		bm.addBook(1, "BookName", 100);
		assertEquals(bm.getAllBooks().size(),1);
		assertFalse(bm.getAllBooks().isEmpty());
		bm.addBook(2, "BookName1", 100);
		assertEquals(bm.getAllBooks().size(),2);
		assertFalse(bm.getAllBooks().isEmpty());
	}


	@Test
	@DisplayName("Test to Display book by Id")
	void testBookDisplayById() {
		bm.addBook(1, "BookName", 100);
		assertEquals(bm.getAllBooks().size(),1);
		assertFalse(bm.getAllBooks().isEmpty());
		try {
			assertEquals(bm.displayBookById(1),"BookName-100");
		} catch (ArrayListNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test 
	@DisplayName("Test to Delete book by Id")
	void testBookDeleteById(){
		bm.addBook(1, "BookName", 100);
		assertEquals(bm.getAllBooks().size(),1);
		assertFalse(bm.getAllBooks().isEmpty());
		try {
			bm.delBookById(1);
		} catch (ArrayListNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(bm.getAllBooks().size(),0);
		assertTrue(bm.getAllBooks().isEmpty());
		bm.addBook(2, "BookName2", 1200);
		bm.addBook(3, "BookName3", 1300);
		assertEquals(bm.getAllBooks().size(),2);
		assertFalse(bm.getAllBooks().isEmpty());
		try {
			bm.delBookById(2);
		} catch (ArrayListNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bm.delBookById(3);
		} catch (ArrayListNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(bm.getAllBooks().size(),0);
		assertTrue(bm.getAllBooks().isEmpty());

	}

	@Test
	@DisplayName("Test method bookUpdateById() if both name and price are to be updated")
	void testBookUpdate1() {
		bm.addBook(1, "BookName", 100);
		assertEquals(bm.getAllBooks().size(),1);
		assertFalse(bm.getAllBooks().isEmpty());
		try {
			b = bm.updateBookById(1,"NewBookNameOnlyName","yes",10000,"yes");
			assertEquals(b.getBname(),"NewBookNameOnlyName");
			assertEquals(b.getPrice(),10000);
		} catch (ArrayListNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	@DisplayName("Test method bookUpdateById() only name is to be updated")
	void testBookUpdate2() {
		bm.addBook(1, "BookName", 100);
		assertEquals(bm.getAllBooks().size(),1);
		assertFalse(bm.getAllBooks().isEmpty());
		try {
			b = bm.updateBookById(1,"NewBookNameOnlyName","yes",10000,"no");
			assertEquals(b.getBname(),"NewBookNameOnlyName");
			assertNotEquals(b.getPrice(),10000);
		} catch (ArrayListNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	@DisplayName("Test method bookUpdateById() only price is to be updated")
	void testBookUpdate3() {
		bm.addBook(1, "BookName", 100);
		assertEquals(bm.getAllBooks().size(),1);
		assertFalse(bm.getAllBooks().isEmpty());
		try {
			b = bm.updateBookById(1,"NewBookNameOnlyName","no",10000,"yes");
			assertNotEquals(b.getBname(),"NewBookNameOnlyName");
			assertEquals(b.getPrice(),10000);
		} catch (ArrayListNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	@DisplayName("Test method bookUpdateById() if neither name nor price are to be updated")
	void testBookUpdate4() {
		bm.addBook(1, "BookName", 100);
		assertEquals(bm.getAllBooks().size(),1);
		assertFalse(bm.getAllBooks().isEmpty());
		try {
			b = bm.updateBookById(1,"NewBookNameOnlyName","no",10000,"no");
			assertNotEquals(b.getBname(),"NewBookNameOnlyName");
			assertNotEquals(b.getPrice(),10000);
		} catch (ArrayListNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Testing Exceptions
	@Test
	@DisplayName("Should Throw BookNameNullException when book name is null")
	public void shouldThrowBookNameNullExceptionWhenNameIsNull() {
		Assertions.assertThrows(BookNameNullException.class, ()->{
			bm.validateBook(1, null, 100) ;});
	}
	
	@Test
	@DisplayName("Should Throw BookNameNullException when bookId is negative")
	public void shouldThrowBookIdNegativeExceptionWhenIdIsNegative() {
		Assertions.assertThrows(BookIdNegativeException.class, ()->{
			bm.validateBook(-1, null, 100) ;});
	}
	
	@Test
	@DisplayName("Should Throw ArrayListNullException when book list is null")
	public void shouldThrowArrayListNullExceptionWhenListIsNull() {
		BookManager bm1 = new BookManager();
		Assertions.assertThrows(ArrayListNullException.class, ()->{
			bm1.displayBookById(1) ;});
	}
	
	@Test
	@DisplayName("Should Throw BookAlreadyFoundException when book is already present in Book List")
	public void shouldThrowBookAlreadyFoundExceptionWhenBookIsAlreadyPresent() {
		
		bm.addBook(1, "BookName", 100);
		b = new Book(1,"BookName",100);
		Book b2 = new Book(2,"BookName",100);
		Assertions.assertThrows(BookAlreadyFoundException.class, ()->{
			bm.checkIfBookAlreadyExist(b) ;});
		Assertions.assertThrows(BookAlreadyFoundException.class, ()->{
			bm.checkIfBookAlreadyExist(b2) ;});
	}
	
	@Test
	@DisplayName("Should Throw BookIdNegativeException when book id is negative")
	public void shouldThrowBookIdNegativeExceptionWhenBookIdIsNegative() {
		Assertions.assertThrows(BookIdNegativeException.class, ()->{
			bm.validateBId(-1) ;});
	}
	
	@Test
	@DisplayName("Should Throw BookIdNegativeException when book id has already been used")
	public void shouldThrowBookIdAlreadyExistsExceptionWhenBookIdIsAlreadyPresent() {
		bm.addBook(1, "BookName", 100);
		Assertions.assertThrows(BookIdAlreadyExistsException.class, ()->{
			bm.validateBId(1) ;});
	}
	
	@Test
	@DisplayName("Should Throw BookIdNegativeException when book id is greater than the next id")
	public void shouldThrowBookIdAlreadyExistsExceptionWhenBookIdIsNotTheNextId() {
		bm.addBook(1, "BookName", 100);
		Assertions.assertThrows(BookIdNotNextIdException.class, ()->{
			bm.validateBId(3) ;});
	}
	
	@Test
	@DisplayName("Should Throw BookNameFormatInvalidException when book name is not valid")
	public void shouldThrowBookNameFormatInvalidExceptionWhenListIsNull() {
		Assertions.assertThrows(BookNameFormatInvalidException.class, ()->{
			bm.validateBookName("Qwertion-123") ;});
		Assertions.assertDoesNotThrow( ()->{
			bm.validateBookName("Qwertion 123") ;});
	}
	
	@Test
	@DisplayName("Should Throw BookNotFoundException when a book Id is not found while trying to display it")
	public void shouldThrowBookNotFoundExceptionWhenBookIdNotFoundWhileDisplaying() {
		bm.addBook(1,"BookName", 100);
		Assertions.assertThrows(BookNotFoundException.class, ()->{
			bm.displayBookById(2) ;});
	}
	
	@Test
	@DisplayName("Should Throw BookNotFoundException when a book Id is not found while trying to delete it")
	public void shouldThrowBookNotFoundExceptionWhenBookIdNotFoundWhileDeleting() {
		bm.addBook(1,"BookName", 100);
		Assertions.assertThrows(BookNotFoundException.class, ()->{
			bm.delBookById(2) ;});
	}
	
	@Test
	@DisplayName("Should Throw BookNotFoundException when a book Id is not found while trying to update it")
	public void shouldThrowBookNotFoundExceptionWhenBookIdNotFoundWhileUpdating() {
		bm.addBook(1,"BookName", 100);
		Assertions.assertThrows(BookNotFoundException.class, ()->{
			bm.updateBookById(2,"NewBookNameOnlyName","no",10000,"no") ;});
	}
	
	@Test
	@DisplayName("Should Throw PriceNotValidException when price is zero")
	public void shouldThrowPriceNotValidExceptionPriceIsZero() {
		bm.addBook(1,"BookName", 100);
		Assertions.assertThrows(PriceNotValidException.class, ()->{
			bm.validatePrice(0) ;});
	}
	
	@Test
	@DisplayName("Should Throw PriceNotValidException when price is negative")
	public void shouldThrowPriceNotValidExceptionWhenPriceIsNegative() {
		bm.addBook(1,"BookName", 100);
		Assertions.assertThrows(PriceNotValidException.class, ()->{
			bm.validatePrice(-1) ;});
	}
	

}
