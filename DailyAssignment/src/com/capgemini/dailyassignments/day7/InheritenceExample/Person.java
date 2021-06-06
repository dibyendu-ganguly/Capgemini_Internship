/**
 * 
 */
package com.capgemini.dailyassignments.day7.InheritenceExample;

/**
 * @author DIBYENDU
 *
 */
public class Person {

	/**
	 * @param args
	 */
	 public String name;
	    public String address;

//	    Getters
	    public String getName() { return name; }
	    public String getAddress() { return address; }

//	    Setters
	    public void setAddress(String address) { this.address = address; }
	    public void setName(String name) { this.name = name; }

//	    toString
	    public String toString() {
	        return "Person[name= " + this.getName() + ", address= " + this.getAddress();
	    }

}
