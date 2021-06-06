/**
 * 
 */
package com.capgemini.service;

import com.capgemini.exceptions.FirstNameNotValidException;
import com.capgemini.exceptions.LastNameNotValidException;

/**
 * @author DIBYENDU
 *
 */
public class NameValidation {

	/**
	 * 
	 * @param fname
	 * @throws EmployeeException
	 */
	public String validateFirstName(String fname) throws FirstNameNotValidException {
		if(fname==null || fname.strip().isEmpty() || fname.strip()=="")
			throw new FirstNameNotValidException("First name of the person should not be blank");
		return fname.strip();
	}
	/**
	 * 
	 * @param lname
	 * @throws LastNameNotValidException
	 */
	public String validateLastname(String lname) throws LastNameNotValidException  {
		if(lname==null || lname.trim().isEmpty() || lname.trim()=="")
			throw new LastNameNotValidException("Last name of the person should not be blank");
		return lname.strip();
	}

}
