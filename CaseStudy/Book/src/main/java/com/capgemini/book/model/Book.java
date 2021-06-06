/**
 * 
 */
package com.capgemini.book.model;

/**
 * @author DIBYENDU
 *
 */

public class Book {
	/**
	 * Declaring Class Variables
	 */
	private int bid;
	private String bname;
	private int price;
	
	/**
	 * Default Constructor
	 */
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * parameterized constructor
	 * @param bid for Book Id
	 * @param bname for Book Name
	 * @param price for Book Price
	 */
	public Book(int bid, String bname, int price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}
	/**
	 * getBid method retrieves the book id
	 * @return book Id
	 */
	public long getBid() {
		return bid;
	}
	/**
	 * setBid method sets the book id
	 * @param bid
	 */
	public void setBid(int bid) {
		this.bid = bid;
	}
	/**
	 * getBname method retrieves the book name
	 * @return Book name
	 */
	public String getBname() {
		return bname;
	}
	/**
	 * setBname method sets the book name
	 * @param bname
	 */
	public void setBname(String bname) {
		this.bname = bname;
	}
	/**
	 * getPrice method retrieves the book price
	 * @return Book price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * setPrice method sets the book price
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * Overriding hashCode() method of Object class 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (bid ^ (bid >>> 32));
		result = prime * result + ((bname == null) ? 0 : bname.hashCode());
		result = prime * result + price;
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
		Book other = (Book) obj;
		if (bid != other.bid)
			return false;
		if (bname == null) {
			if (other.bname != null)
				return false;
		} else if (!bname.equals(other.bname))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	/**
	 * Overriding toString() method of Object class
	 */
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + "]";
	}
	
	



}
