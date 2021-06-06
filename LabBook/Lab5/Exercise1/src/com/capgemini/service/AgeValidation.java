/**
 * 
 */
package com.capgemini.service;

import com.capgemini.exceptions.AgeNotValidException;

/**
 * @author DIBYENDU
 *
 */
public class AgeValidation {

	/**
	 * @throws AgeNotValidException 
	 * 
	 */
	public void validateAge(int age) throws AgeNotValidException {
		if(age<=15)
			throw new AgeNotValidException("Age of the person should be above 15");
		return;
	}

}
