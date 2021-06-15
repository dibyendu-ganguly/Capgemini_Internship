/**
 * 
 */
package com.capgemini.bankATMSystem.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.bankATMSystem.service.Account;

/**
 * @author Rajarshi
 *
 */
class AccountTest {

	static Account acc;
	ArrayList<Account> custList = new ArrayList<Account>();
	int accNo = 1234;
	int custId = 1000;
	double balance = 1000;
	String custName = "Rj";
	String custAddress = "Kolkata";
	String email = "rj07@gmail.com";
	String accType = "Savings";
	String pin = "0987";
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		acc = new Account();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		acc = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.capgemini.bankATMSystem.service.Account#getPin()}.
	 */
	@Test
	void testGetPin() {
		
	}

	/**
	 * Test method for {@link com.capgemini.bankATMSystem.service.Account#setPin(java.lang.String)}.
	 */
	@Test
	void testSetPin() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.capgemini.bankATMSystem.service.Account#getAccNumber()}.
	 */
	@Test
	void testGetAccNumber() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.capgemini.bankATMSystem.service.Account#setAccNumber(int)}.
	 */
	@Test
	void testSetAccNumber() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.capgemini.bankATMSystem.service.Account#getBalance()}.
	 */
	@Test
	void testGetBalance() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.capgemini.bankATMSystem.service.Account#setBalance(double)}.
	 */
	@Test
	void testSetBalance() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.capgemini.bankATMSystem.service.Account#getAccType()}.
	 */
	@Test
	void testGetAccType() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.capgemini.bankATMSystem.service.Account#setAccType(java.lang.String)}.
	 */
	@Test
	void testSetAccType() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.capgemini.bankATMSystem.service.Account#addCustomer(java.lang.String)}.
	 */
	@Test
	void testAddCustomer() {
		acc.setAccNumber(accNo);
		acc.setAccType(accType);
		acc.setBalance(balance);
		acc.setCustAddress(custAddress);
		acc.setCustId();
		acc.setCustName(custName);
		acc.setEmail(email);
		acc.setPin(pin);
		assertTrue(custList.add(acc));
	}

	/**
	 * Test method for {@link com.capgemini.bankATMSystem.service.Account#displayDetails(java.util.ArrayList, int)}.
	 */
	@Test
	void testDisplayDetails() {
		assertTrue(custList.get(0).getAccNumber() == accNo);
		assertTrue(custList.get(0).getAccType().equalsIgnoreCase(accType));
		assertTrue(custList.get(0).getBalance() == balance);
		assertTrue(custList.get(0).getCustAddress() == custAddress);
		assertTrue(custList.get(0).getCustId() == custId);
		assertTrue(custList.get(0).getCustName() == custName);
		assertTrue(custList.get(0).getEmail() == email);
		assertTrue(custList.get(0).getPin() == pin);
	}

	/**
	 * Test method for {@link com.capgemini.bankATMSystem.service.Account#changePin(java.util.ArrayList, int)}.
	 */
	@Test
	void testChangePin() {
		String new_pin = "8709";
		custList.get(0).setPin(new_pin);
		assertTrue(custList.get(0).getPin() == new_pin);
	}

}
