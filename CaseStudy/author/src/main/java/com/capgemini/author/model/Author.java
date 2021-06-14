/**
 * 
 */
package com.capgemini.author.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author DIBYENDU
 *
 */
public class Author {
	/**
	 * Declaring class variables
	 */
	private String name;
	private String email;
	private char gender;
	
	/**
	 * Default constructor
	 */
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Parameterized Constructor
	 * @param name for firstName of author
	 * @param email for email of author
	 * @param gender for gender of author
	 */
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	/**
	 * Overriding hashCode() method of Object class
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + gender;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/**
	 * Overriding equals() method of Object class
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	/**
	 * Overriding toString() method of Object class
	 */
	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	/**
	 * method print() to print "name (gender) at email"
	 */
	public void print() {
		System.out.println("\""+name+" ("+gender+") at "+email+"\"");
	}
	/**
	 * Checks if first name is validated
	 */
	public void validateName() {
		// TODO Auto-generated method stub
		if(this.name.isEmpty() || this.name == null || this.name.equals("")){
			throw new RuntimeException("Name cannot be null or empty");
		}
		else {
			String userNamePattern = "[A-Za-z\s]*";
			Pattern pat=Pattern.compile(userNamePattern);
			Matcher matcher = pat.matcher(this.name);
			boolean username_result = matcher.matches();
			if(!username_result) {
				throw new RuntimeException("Entered name does not follow the required format");
			}
		}
	}
	/**
	 * Checks if email is validated
	 */
	public void validateEmail() {
		if(this.email.isEmpty() || this.email == null || this.email.equals("")) {
			throw new RuntimeException("Email cannot be null or empty");
		}
		else {
			String emailPattern = "^(.+)@(.+)\\.(.+)$";
			Pattern pat=Pattern.compile(emailPattern);
			Matcher matcher = pat.matcher(email);
			boolean email_result = matcher.matches();
			if(!email_result) {
				throw new RuntimeException("Entered email does not follow the required format");
			}
			
		}
	}
	/**
	 * Checks if gender is validated
	 */
	public void validateGender() {
		if(this.gender!='m' || this.gender=='f' || this.gender=='u') {
			throw new RuntimeException("Gender is not valid");
		}
	}
	
	

}
