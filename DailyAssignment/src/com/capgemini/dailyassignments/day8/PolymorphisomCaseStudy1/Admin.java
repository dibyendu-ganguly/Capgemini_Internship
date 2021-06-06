/**
 * 
 */
package com.capgemini.dailyassignments.day8.PolymorphisomCaseStudy1;

/**
 * @author DIBYENDU
 *
 */
public class Admin extends Payroll{
	private String name;
    private int salary;
        
    Admin() {}

    public Admin(String name, int salary) {
        this.name = name;
        this.salary = salary;
        super.adjustSalary(salary);
        //System.out.println("Name: " + name);
    }

    public void doAdminStuff() {
        System.out.println("Doing Admin Stuff");
    }

	public String getName() {
		System.out.println(this.name);
		return name;
	}
	
	public int getSalary() {
		System.out.println(this.salary);
		return salary;
	}

	

}
