/**
 * 
 */
package com.capgemini.book.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author DIBYENDU
 *
 */
class BookTest {
	static Book book;
	Book book1 = new Book();
	Book bookTemp;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		book = new Book(1,"BookName",100);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		book = null;		//eligible for Garbage collector
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		bookTemp = new Book();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		bookTemp = null;		//eligible for Garbage collector
	}

	/**
	 * Test method for {@link com.capgemini.book.model.Book#Book()}.
	 */
	@Test
	@DisplayName("Test for Default Constructor")
	void testBook() {
		assertEquals(new Book(),bookTemp);
	}

	/**
	 * Test method for {@link com.capgemini.book.model.Book#Book(int, java.lang.String, int)}.
	 */
	@Test
	@DisplayName("Test for Parameterized Constructor taking all arguments")
	void testBookIntStringInt() {
		assertEquals(new Book(1,"BookName",100),book);
	}

	/**
	 * Test method for {@link com.capgemini.book.model.Book#getBid()}.
	 */
	@Test
	@DisplayName("Test for getBid() method")
	void testGetBid() {
		assertEquals(book.getBid(),1);
	}

	/**
	 * Test method for {@link com.capgemini.book.model.Book#setBid(int)}.
	 */
	@Test
	@DisplayName("Test for setBid() method")
	void testSetBid() {
		book1.setBid(1234);
		assertEquals(1234,book1.getBid());
		
	}

	/**
	 * Test method for {@link com.capgemini.book.model.Book#getBname()}.
	 */
	@Test
	@DisplayName("Test for getBname() method")
	void testGetBname() {
		assertEquals(book.getBname(),"BookName");
	}

	/**
	 * Test method for {@link com.capgemini.book.model.Book#setBname(java.lang.String)}.
	 */
	@Test
	@DisplayName("Test for setBname() method")
	void testSetBname() {
		book1.setBname("BookName");
		assertEquals("BookName",book1.getBname());
	}

	/**
	 * Test method for {@link com.capgemini.book.model.Book#getPrice()}.
	 */
	@Test
	@DisplayName("Test for getPrice() method")
	void testGetPrice() {
		assertEquals(book.getPrice(),100);
	}

	/**
	 * Test method for {@link com.capgemini.book.model.Book#setPrice(int)}.
	 */
	@Test
	@DisplayName("Test for setPrice() method")
	void testSetPrice() {
		book1.setPrice(100);
		assertEquals(100,book1.getPrice());
	}

	/**
	 * Test method for {@link com.capgemini.book.model.Book#toString()}.
	 */
	@Test
	@DisplayName("Test for toString() method")
	void testToString() {
		assertEquals(book.toString(),"Book [bid=1, bname=BookName, price=100]");
	}

}
