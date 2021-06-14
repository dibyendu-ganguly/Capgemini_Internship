/**
 * 
 */
package com.capgemini.author.serivice;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.author.model.Author;


/**
 * @author DIBYENDU
 *
 */
public class AuthorManager {
	/*
	 * ConcurrentHashMap Object to store contactList
	 */
	Map<String,Author> authorList=new ConcurrentHashMap<String,Author>();
	
	/**
	 * addContact Method to add author in to contactList Object
	 * @param name gets the first name of contact.
	 * @param email gets the last name of contact.
	 * @param gender gets the gender of the author.
	 */
	public void addAuthor(String name,String email,char gender){
		Author author=new Author(name,email,gender);
		validateContact(author);
		checkIfAuthorAlreadyExist(author);
		authorList.put(generateKey(author), author);
	}
	
	/**
	 * generateKey method generates a key to store the value
	 */
	private String generateKey(Author author){
		return String.format("%s-%s",author.getName(),author.getGender());
	}
	/**
	 * checkIfauthorAlreadyExist method checks whether author is already added in the list
	 * @param author
	 */
	private void checkIfAuthorAlreadyExist(Author author){
		if(authorList.containsKey(generateKey(author))){
			throw new RuntimeException("author Already Exists");
		}
	}
	/**
	 * validateContact method validates the author
	 * @param author
	 */
	private void validateContact(Author author){
		author.validateName();
		author.validateEmail();
		author.validateGender();
	}
	
	/**
	 * 
	 * @return all values of authorList
	 */
	public Collection<Author> getAllAuthors(){
		return authorList.values();
	}

}
