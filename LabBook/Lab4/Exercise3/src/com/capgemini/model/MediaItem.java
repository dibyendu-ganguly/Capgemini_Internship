/**
 * 
 */
package com.capgemini.model;

/**
 * @author DIBYENDU
 *
 */
public abstract class MediaItem extends Item{
	private int runTime;
	
	public MediaItem(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "MediaItem [runTime=" + runTime + ", getRunTime()=" + getRunTime() + ", getIdentificationNumber()="
				+ getIdentificationNumber() + ", getTitle()=" + getTitle() + ", getNumberOfCopies()="
				+ getNumberOfCopies() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}


	public MediaItem(int identificationNumber, String title, int numberOfCopies, int runTime) {
		super(identificationNumber, title, numberOfCopies);
		this.runTime = runTime;
	}


	/**
	 * @return the runTime
	 */
	public int getRunTime() {
		return runTime;
	}

	/**
	 * @param runTime the runTime to set
	 */
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	
	
}
