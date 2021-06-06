/**
 * 
 */
package com.capgemini.dailyassignments.day7.InheritenceExample;

/**
 * @author DIBYENDU
 *
 */
public class Staff extends Person {

	/**
	 * 
	 */
	private String school;
    private double pay;

//    Getters
    public String getSchool() { return school; }
    public double getPay() { return pay; }

//    Setters
    public void setSchool(String school) { this.school = school; }
    public void setPay(double pay) { this.pay = pay; }

//    toString
    public String toString() { return "Staff[Person[name= " + getName() + ", address= " + getAddress() + ", school= " + getSchool() + ", pay= " + getPay(); }
	

}
