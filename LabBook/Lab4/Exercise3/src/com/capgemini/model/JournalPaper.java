/**
 * 
 */
package com.capgemini.model;

/**
 * @author DIBYENDU
 *
 */
public class JournalPaper extends WrittenItem{
	
	private int yearPublished;
	

	public JournalPaper(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
		
	}

	public JournalPaper(int identificationNumber, String title, int numberOfCopies, int yearPublished) {
		super(identificationNumber, title, numberOfCopies);
		this.setYearPublished(yearPublished);
	}



	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	public String toString() {
		return "JournalPaper [yearPublished=" + yearPublished + ", getAuthor()=" + getAuthor()
				+ ", getIdentificationNumber()=" + getIdentificationNumber() + ", getTitle()=" + getTitle()
				+ ", getNumberOfCopies()=" + getNumberOfCopies() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}
	
	
	
}
