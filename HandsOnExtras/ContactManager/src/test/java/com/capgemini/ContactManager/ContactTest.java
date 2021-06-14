package com.capgemini.ContactManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.cmapp.model.Contact;

public class ContactTest {
	
	public static Contact ct;
	
	@BeforeAll
	public static void setUp() {
		ct=new Contact();
		ct=new Contact("Deb","Roy","9674132442");
	}
	
	@BeforeEach
	public void setUpForTest() {
		//ct.readDetails();
	}
	
	@Test
	public void contactTest() {
		Contact ct=new Contact("Deb","Roy","9674132442"); 
		assertNotNull(ct);
		
		Contact ct1=null;
		assertNull(ct1);
	}
	
	@Test
	public void testGetters() {
		assertEquals("Deb",ct.getfName());
		assertEquals("Roy",ct.getlName());
		assertEquals("9674132442",ct.getPhNo());
		
	}
	
//	@Test
//	public void testSetters() {
//		assertEquals();
//		assertEquals();
//		assertEquals();
//		
//	}
}