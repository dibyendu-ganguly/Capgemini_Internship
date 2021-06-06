/**
 * 
 */
package com.cg.eis.bean;

/**
 * @author DIBYENDU
 *
 */
public class Employee {
	public int id;
	public String name;
	public double salary;
	public String designation;
	public String insuranceScheme;
	public int nextId=0;
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = ++nextId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	

}
