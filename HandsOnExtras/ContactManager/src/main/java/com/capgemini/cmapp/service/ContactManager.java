/**
 * 
 */
package com.capgemini.cmapp.service;

/**
 * @author DIBYENDU
 *
 */

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.cmapp.model.Contact;

public class ContactManager {
	/*
	 * ConcurrentHashMap is the collection which allows us to retrieve and modify data while iterating
	 * through the collection of Objects inside the map.
	 */
	
	/*
	 * ConcurrentHashMap Object to store contactList
	 */
	Map<String,Contact> contactList=new ConcurrentHashMap<String,Contact>();
	
	/*
	 * addContact Method to add contacts in to contactList Object
	 * @param firstName gets the first name of contact.
	 * @param lastName gets the last name of contact.
	 * @param phoneNo gets the phone number of contact.
	 */
	
	//below are the documentation comments used to generate documentation for the code
	
	/**
	 * addContact Method to add contacts in to contactList Object
	 * @param firstName gets the first name of contact.
	 * @param lastName gets the last name of contact.
	 * @param phoneNo gets the phone number of contact.
	 */
	public void addContact(String firstName,String lastName,String phoneNo){
		Contact contact=new Contact(firstName,lastName,phoneNo);
		validateContact(contact);
		checkIfContactAlreadyExist(contact);
		contactList.put(generateKey(contact), contact);
	}
	
	/**
	 * generateKey method generates a key to store the value
	 */
	private String generateKey(Contact contact){
		return String.format("%s-%s",contact.getfName(),contact.getlName());
	}
	/**
	 * checkIfContactAlreadyExist method checks whether contact is already added in the list
	 * @param contact
	 */
	private void checkIfContactAlreadyExist(Contact contact){
		if(contactList.containsKey(generateKey(contact))){
			throw new RuntimeException("Contact Already Exists");
		}
	}
	/**
	 * validateContact method validates the contact
	 * @param contact
	 */
	private void validateContact(Contact contact){
		contact.validateFirstName();
		contact.validateLastName();
		contact.validatePhNo();
	}
	
	/**
	 * 
	 * @return all values of contactList
	 */
	public Collection<Contact> getAllContacts(){
		return contactList.values();
	}
}