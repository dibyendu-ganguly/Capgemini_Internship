/**
 * 
 */
package com.capgemini.model;

/**
 * @author DIBYENDU
 *
 */
public class CD extends MediaItem{
	public CD(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}
	
	public CD(int identificationNumber, String title, int numberOfCopies, String actor, String genre) {
		super(identificationNumber, title, numberOfCopies);
		this.actor = actor;
		this.genre = genre;
	}
	private String actor;
	private String genre;
	/**
	 * @return the actor
	 */
	public String getActor() {
		return actor;
	}
	/**
	 * @param actor the actor to set
	 */
	public void setActor(String actor) {
		this.actor = actor;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "CD [actor=" + actor + ", genre=" + genre + "]";
	}
	

}
