/**
 * 
 */
package com.capgemini.service;

/**
 * @author DIBYENDU
 *
 */
public class EmployeeService {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeRepository e = new EmployeeRepository();
		e.addEmployee();
		System.out.println("\n1. Sum of salary of all employees. "+e.salSum());
		System.out.println("\n2. Departments and their count of employee:");
		e.deptAndEmpCount();
		System.out.println("\n3. Senior most Employee");
		e.getSeniorEmployee();
		System.out.println("\n4. List of employees and their duration of service in days and months");
		e.getEmpAndDuration();
		System.out.println("\n5. Employees without departments: ");
		e.getEmpWithoutDepartment();
		//System.out.println("\n6. Departments without employees");
		//e.getDeptWithoutEmp();
		System.out.println("\n7. Department with highest employees: ");
		e.getDepartmentWithHighestEmployee();
		System.out.println("\n8. List of employees with Name, hiredate and day of week on which they started");
		e.getEmpNameHireDateAndDayOfWeekOfStarting();
		System.out.println("\n9. List of employees with Name, hiredate and day of week is Friday");
		e.getEmpNameHireDateAndDayOfWeekOfStartingIsFriday();
		System.out.println("\n10. Employee manager report");
		e.getEmployeeManagerDetails();
		System.out.println("\n12. List of employees without any manager");
		e.getEmployeeWithoutManager();
		System.out.println("\n13. List of subordinates of a manager");
		e.getEmployeeByManagerName();
		System.out.println("\n14.1 Employee sorted by id");
		e.sortEmployeeById();
		System.out.println("\n14.2 Employee sorted by department id");
		e.sortEmployeeByDepartmentId();
		System.out.println("\n14.3 Employee sorted by name");
		e.sortEmployeeByName();
		
		//System.out.println(EmployeeRepository.list);
	}

}
