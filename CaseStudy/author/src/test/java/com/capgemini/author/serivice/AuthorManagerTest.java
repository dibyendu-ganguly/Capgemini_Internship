/**
 * 
 */
package com.capgemini.author.serivice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




/**
 * @author DIBYENDU
 *
 */
class AuthorManagerTest {

	/**
	 * @throws java.lang.Exception
	 */
	AuthorManager am;
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Should print before all tests");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Should print before all tests");
		System.out.println("Instantiating the contact manager");
		am = new AuthorManager();
	}

	@Test
	@DisplayName("Should create author")
	public void shouldCreateAuthor() {
		am.addAuthor("Dibyendu Ganguly", "dibyenduganguly.48@gmail.com", 'm');
		assertFalse(am.getAllAuthors().isEmpty());
		assertEquals(1,am.getAllAuthors().size());
	}
	//Testing Exceptions
	@Test
	@DisplayName("Should not create contact when first name is null")
	public void shouldThrowTimeExceptionWhenFirstNameIsNUll() {
		Assertions.assertThrows(RuntimeException.class, ()->{
			am.addAuthor(null, "dibyenduganguly.48@gmail.com", 'm');});
	}
	
	//Testing Exceptions
	@Test
	@DisplayName("Should not create contact when Last name is null")
	public void shouldThrowTimeExceptionWhenEmailIsNUll() {
		Assertions.assertThrows(RuntimeException.class, ()->{
			am.addAuthor("Dibyendu Ganguly", null, 'm');});
	}


	@Test
	void test() {
		fail("Not yet implemented");
	}

}
