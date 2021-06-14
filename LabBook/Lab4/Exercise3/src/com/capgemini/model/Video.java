/**
 * 
 */
package com.capgemini.model;

/**
 * @author DIBYENDU
 *
 */
public class Video extends MediaItem{
	
	private String director;
	private String genre;
	private int yearReleased;
	
	public Video(int identificationNumber, String title, int numberOfCopies, String director, String genre,
			int yearReleased) {
		super(identificationNumber, title, numberOfCopies);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
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

	/**
	 * @return the yearReleased
	 */
	public int getYearReleased() {
		return yearReleased;
	}

	/**
	 * @param yearReleased the yearReleased to set
	 */
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}

	public Video(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", yearReleased=" + yearReleased + "]";
	}

}
