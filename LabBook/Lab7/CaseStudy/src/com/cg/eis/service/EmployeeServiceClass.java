/**
 * 
 */
package com.cg.eis.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;

/**
 * @author DIBYENDU
 *
 */
public class EmployeeServiceClass {

	/**
	 * 
	 */
	Scanner sc = new Scanner(System.in);
	HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
	Employee e;
	int nextId = 0;
	public void addEmployee() throws Exception {
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		name = name.toUpperCase();
		System.out.println("Enter salary: ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter designation: ");
		String des = sc.nextLine();
		des = des.substring(0, 1).toUpperCase() + des.substring(1).toLowerCase();
		String inScheme;
		if(salary<20000 && salary>5000 && des.equalsIgnoreCase("system associate"))
			inScheme = "Scheme C";
		else if(salary<40000 && salary>=20000 && des.equalsIgnoreCase("programmer"))
			inScheme = "Scheme B";
		else if(salary>=40000 && des.equalsIgnoreCase("manager"))
			inScheme = "Scheme A";
		else if(salary>=40000 && des.equalsIgnoreCase("manager"))
			inScheme = "No Scheme";
		else
			throw new Exception("Wrong combination of Salary and Designation");
		e = new Employee(++nextId, name, salary, des, inScheme);
		map.put(nextId, e);
	}
	
	public void displayEmployeeDetailsByInsuranceScheme() {
		System.out.println("Enter Scheme: ");
		String s = sc.nextLine();
		for (Map.Entry<Integer,Employee> m : map.entrySet()) {
			//System.out.println(m.getValue().getInsuranceScheme().equals(s));
			String t = m.getValue().getInsuranceScheme();
			if (s.equalsIgnoreCase(t)) {
				System.out.println("----------------"
								  +"Employee details"
								  +"----------------");
				System.out.format("%3s || %20s || %7s || %15s || %8s\n","Id","Name","Salary","Designation","Scheme");
				System.out.println("__________________________________________________________________");
				System.out.format("%3s || %20s || %7s || %15s || %8s\n",m.getValue().getId(),m.getValue().getName(),m.getValue().getSalary(),m.getValue().getDesignation(),m.getValue().getInsuranceScheme());
				return;
			}
		}
		System.out.println("No details found with Insurnace scheme " + s);
	}
	
	public void delEmployeeById() {
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		for (Map.Entry<Integer,Employee> m : map.entrySet()) {
			if (m.getValue().getId() == id) {
				map.remove(m.getKey());
				return;
			}
		}
		System.out.println("No details found with Id " + id);
	}

}
