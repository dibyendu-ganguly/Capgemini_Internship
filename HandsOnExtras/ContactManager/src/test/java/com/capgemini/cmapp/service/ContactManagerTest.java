/**
 * 
 */
package com.capgemini.cmapp.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author DIBYENDU
 *
 */
class ContactManagerTest {

	/**
	 * @throws java.lang.Exception
	 */
	ContactManager contManager;

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

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Should print before all tests");
		System.out.println("Instantiating the contact manager");
		contManager = new ContactManager();
	}

	/**
	 * @throws java.lang.Exception
	 */
	

	
	@Test
	@DisplayName("Should create contact")
	public void shouldCreateContact() {
		contManager.addContact("Rama", "Krishna", "09876543211");
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1,contManager.getAllContacts().size());
	}
	//Testing Exceptions
	@Test
	@DisplayName("Should not create contact when first name is null")
	public void shouldThrowTimeExceptionWhenFirstNameIsNUll() {
		Assertions.assertThrows(RuntimeException.class, ()->{
			contManager.addContact(null, "Krishna", "09876543211");});
	}

	//Testing Exceptions
	@Test
	@DisplayName("Should not create contact when Last name is null")
	public void shouldThrowTimeExceptionWhenLastNameIsNUll() {
		Assertions.assertThrows(RuntimeException.class, ()->{
			contManager.addContact("Rama", null, "09876543211");});
	}
	//Testing Exceptions
	@Test
	@DisplayName("Should not create contact when Phone number is null")
	public void shouldThrowTimeExceptionWhenPhoneNumberIsNUll() {
		Assertions.assertThrows(RuntimeException.class, ()->{
			contManager.addContact("Rama", "Krishna", null);});
	}

	@Nested
	class RepeatedTests{
		@DisplayName("Should create contact")
		@RepeatedTest(value= 5, name="Repeating contact creation test{currrentRepetition} of {totalRepetition}")
		public void shouldCreateContactRepeatedly() {
			contManager.addContact("Rama", "Krishna", "09876543211");
			assertFalse(contManager.getAllContacts().isEmpty());
			assertEquals(1,contManager.getAllContacts().size());
		}
	}

	@Nested
	class ParamterizedTests{
		@DisplayName("Phone number should match with required format")
		@ParameterizedTest
		@ValueSource(strings= {"09876543211","09876543212","09876543213"})
		public void shouldTestPhoneNumberFormatUsingValueSource(String phoneNumber) {
			contManager.addContact("Rama", "Krishna", phoneNumber);
			assertFalse(contManager.getAllContacts().isEmpty());
			assertEquals(1,contManager.getAllContacts().size());
		}
	}
	
	private static List<String> phoneNumberList(){
		return Arrays.asList("09876543234","09876543235","09876543236");
	}
	
	@DisplayName("Testing Phone numbers in required format using Method source")
	@MethodSource("phoneNumberList")
	public void testPhoneNumbersUsingMethodSource(String phoneNumber) {
		contManager.addContact("Rama", "Krishna", phoneNumber);
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1,contManager.getAllContacts().size());
	}
	
	@Test
	@DisplayName("Disable Test")
	@Disabled
	//@Ignore (for junit 4)
	public void disabledTest() {
		throw new RuntimeException("This test is disabled test");
	}
	
	
	
	@AfterEach
	public void tearDown() {
		System.out.println("Should execute after each test");
	}
	
	@AfterAll
	public static void tearDownAll() {
		System.out.println("Should execute after all tests are done");
	}
	

}
