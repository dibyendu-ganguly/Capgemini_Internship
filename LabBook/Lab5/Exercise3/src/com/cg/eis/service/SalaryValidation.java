/**
 * 
 */
package com.cg.eis.service;

import com.cg.eis.exception.EmployeeException;

/**
 * @author DIBYENDU
 *
 */
public class SalaryValidation {

	public void salaryValidate(int sal) throws EmployeeException {
		if(sal<3000)
			throw new EmployeeException("Salary of an employee cannot be below 3000");
		return;
	}

}
