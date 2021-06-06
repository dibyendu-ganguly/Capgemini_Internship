package com.capgemini.dailyassignments.day11.ems;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring an array of employee
		Employee[] empList;
		
		//allocating the memory for 3 employee objects 
		empList = new Employee[3];
		
		//Employee[] empList = new Employee[3];
		
		//Initializing the first array element with employee Object
		empList[0] = new Employee(1234, "Rama");
		empList[1] = new Employee(1235, "Ramana");
		empList[2] = new Employee(1236, "Ramji");
		
		//displaying data in the objects stored in the array using index
		empList[0].displayEmpDetails();
		empList[1].displayEmpDetails();
		  //displayEmpDetails with no argument is called
	   empList[2].displayEmpDetails();
	   
	   Employee emp = new Employee();
	   Employee[] empList1 = new Employee[3];
	   Scanner sc = new Scanner(System.in);
	   empList1 =  emp.createEmpList();

	   
	
		  //displayEmpDetails with employee[] object as argument is called
		  System.out.println("Out put from displayEmpDetails with employee[] object as argument ");
	  emp.displayEmpDetails(empList1);
	  
	  Employee emp2 = new Employee();
	  emp2.setEmpId(120005);
	  emp2.setEmpName("Ramji");
	  System.out.println("Out put from displayEmpDetails with employee object as argument ");
	  //displayEmpDetails with employee object as argument is called
	  emp.displayEmpDetails(emp2);
	   
	  //call find by employee by id
	  System.out.println("Enter the empid to find an employee");
	  int id = sc.nextInt();
	  emp.findEmployeeById(empList1, id);
	  
	  
	  //call update by employee by id
	  System.out.println("Enter the empid to update an employee details");
	  int eid = sc.nextInt();
	  emp.updateEmployeeById(empList1, eid);
	  
	  //call delete by employee by id
	  System.out.println("Enter the empid to delete an employee details");
	  int did = sc.nextInt();
	  emp.deleteEmployeeById(empList1, did);
	 
	   sc.close();
	}
}
