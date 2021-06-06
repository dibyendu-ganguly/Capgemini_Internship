/**
 * 
 */
package com.capgemini.dailyassignments.day8.PolymorphisomCaseStudy1;

/**
 * @author DIBYENDU
 *
 */
public class Payroll {
	private int salary;
	
	public void adjustSalary(int salary) {
		this.salary= salary;
        
    }

	public int getSalary() {
		System.out.println("Salary is: " + this.salary);
		System.out.println("Salary is: " + salary);
		return salary;
	}
	
}
