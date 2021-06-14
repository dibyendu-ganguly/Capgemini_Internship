/**
 * 
 */
package com.capgemini.model;

/**
 * @author DIBYENDU
 *
 */
public abstract class WrittenItem extends Item{
	
	private String author;
	public WrittenItem(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
		this.setAuthor(author);
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
