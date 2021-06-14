/**
 * 
 */
package com.capgemini.model;

/**
 * @author DIBYENDU
 *
 */
public class Book extends WrittenItem {

	public Book(String string, int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Book [getAuthor()=" + getAuthor() + ", getIdentificationNumber()=" + getIdentificationNumber()
				+ ", getTitle()=" + getTitle() + ", getNumberOfCopies()=" + getNumberOfCopies() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}

	@Override
	public void addItems()
	{
		setNumberOfCopies(getNumberOfCopies() + 1);
	}
	
	@Override
	public void checkIn()
	{
		setNumberOfCopies(getNumberOfCopies() + 1);
	}
	
	@Override
	public void checkOut()
	{
		setNumberOfCopies(getNumberOfCopies() - 1);
	}
	
}
