/**
 * 
 */
package com.capgemini.author.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author DIBYENDU
 *
 */
class AuthorTest {

	/**
	 * @throws java.lang.Exception
	 */
	static Author author;
	Author author1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		author = new Author("Dibyendu Ganguly","dibyenduganguly.48@gmail.com",'m');
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		author=null;  //eligible for garbage collector
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		author1 = new Author();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		author1 = null;
	}

	@Test
	void test() {
		assertEquals(new Author(),author1);
	}
	
	/**
	 * Test method for {@link com.capgemini.contactmanagerappusingcollections.model.Contact#getfName()}.
	 */
	@Test
	void testGetName() {
		assertEquals("Dibyendu Ganguly",author.getName());
	}


	/**
	 * Test method for {@link com.capgemini.contactmanagerappusingcollections.model.Contact#getlName()}.
	 */
	@Test
	void testGetEmail() {
		assertEquals("dibyenduganguly.48@gmail.com",author.getEmail());
	}

	
	/**
	 * Test method for {@link com.capgemini.contactmanagerappusingcollections.model.Contact#getPhNo()}.
	 */
	@Test
	void testGetGender() {
		assertEquals('m',author.getGender());
	}

}
