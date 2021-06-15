/**
 * 
 */
package com.capgemini.service;

import java.time.LocalDate;
//import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

import com.capgemini.model.Department;
import com.capgemini.model.Employee;



/**
 * @author DIBYENDU
 *
 */
public class EmployeeRepository {
	static List<Employee> list = new ArrayList<Employee>();
	Scanner sc = new Scanner(System.in);
	Department cash = new Department(1,"Accounts",3);
	Department hr = new Department(2, "HR", 2);
	Department tech = new Department(3,"Tech", 4);
	Department errands = new Department(4,"Errands", 5);
	Employee e1 = new Employee(1,"Dibyendu","Ganguly","dibyendu@gmail.com","9874113493",  LocalDate.of(2015, 1, 19) , "Manager", 30000.0, tech );
	Employee e2 = new Employee(2,"Utkarsh","Parashar","utkarsh@gmail.com","9939393907", LocalDate.of(2018, 1, 13), "Team Lead", 30000.0, 1, cash );
	Employee e3 = new Employee(3,"Somraj","Banerjee","somraj@gmail.com","9766543211", LocalDate.of(2019, 5, 13), "Manager", 30000.0, 1, tech );
	Employee e4 = new Employee(4,"Ayan","Das","ayan@gmail.com","9909793280", LocalDate.of(2017, 2, 14), "Team Lead", 30000.0, 1, cash );
	Employee e5 = new Employee(5,"Pulak","Das","pulak@gmail.com","9874112293", LocalDate.of(2020, 11, 20), "Cleark", 30000.0, 6 );
	Employee e6 = new Employee(6,"Aniket","Maity","aniket@gmail.com","9939393907", LocalDate.of(2021, 1, 12), "Clerk", 30000.0 );
	Employee e7 = new Employee(7,"Anindya","Chakraborty","anindya@gmail.com","9712345673", LocalDate.of(2016, 1, 13), "Analyst", 30000.0, 6, cash );
	Employee e8 = new Employee(8,"Rajarshi","Bhattacharya","raj@gmail.com","9876543210", LocalDate.of(2015, 4, 24), "Team Lead", 30000.0, 6, hr );
	
	
	public void addEmployee() {
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		//System.out.println(list);
	}
	//•	Find out the sum of salary of all employees. 
	public Double salSum() {
		return EmployeeRepository.list.stream().mapToDouble(o->o.getSalary()).sum();
	}
	
	//•	List out department names and count of employees in each department. 
	public Map<Department, Long> deptAndEmpCount() {
//		EmployeeRepository.list.stream()
//		.filter(o -> o.getDepartment() != null)
//		.forEach(System.out::println);
		
		Map<Department, Long> result = EmployeeRepository.list.stream()
				.filter(Employee -> Employee.getDepartment() != null)
		        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		result.entrySet().stream().forEach(e -> System.out.println(e.getKey().getDepartmentName() + ":" + e.getValue()));
		return result;
	}
	//•	Find out the senior most employee of an organization. 
	public List<Employee> getSeniorEmployee() {
		LocalDate date = EmployeeRepository.list.stream().map(u -> u.getHireDate()).min(LocalDate::compareTo).get();
		EmployeeRepository.list.stream()
        .filter(e -> e.getHireDate() == date)
        .map(Employee::getFullName)
        .forEach(System.out::println);
		
		return EmployeeRepository.list.stream()
        .filter(e -> e.getHireDate() == date)
        .collect(Collectors.toList());
	}
	//•	List employee name and duration of their service in months and days
	public void getEmpAndDuration() {
		LocalDate now = LocalDate.now();
		
		//Map<String, Period> result = EmployeeRepository.list.stream()
		  //      .collect(Collectors.toMap(Employee::getFullName, e->Period.between(e.getHireDate(),now)));
		System.out.format("%25s|%8s|%6s\n"
						+ "-----------------------------------------\n","Name","Months","Days");
		EmployeeRepository.list.stream().forEach(e -> System.out.format("%25s|%8s|%6s\n",e.getFullName(), ChronoUnit.MONTHS.between(e.getHireDate(),now) ,ChronoUnit.DAYS.between(e.getHireDate(),now) )) ;
		//result.entrySet().stream().forEach(e -> System.out.format("%25s|%12s|%8s|%6s\n",e.getKey(),e.getValue(),((e.getValue().getYears()*12)+e.getValue().getMonths()),  e.getValue().getDays() ));
	}
	
	//•	Find out employees without department.
	public void getEmpWithoutDepartment() {
		EmployeeRepository.list.stream()
		.filter(Employee -> Employee.getDepartment() == null)
		.forEach(e -> System.out.print(e.getFullName()+"\n"));
	}
	//•	Find out department without employees.
	public  void getDeptWithoutEmp() {
		
	}
	//•	Find departments with highest count of employees.
	public void getDepartmentWithHighestEmployee() {
//		Map<Department, Long> result = EmployeeRepository.list.stream()
//				.filter(Employee -> Employee.getDepartment() != null)
//		        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		Long maxCount = EmployeeRepository.list.stream()
				.filter(Employee -> Employee.getDepartment() != null)
		        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
		        .entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
		
		EmployeeRepository.list.stream()
		.filter(Employee -> Employee.getDepartment() != null)
        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
        .entrySet().stream()
        .filter(e -> e.getValue() == maxCount)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList())
        .forEach(e -> System.out.print(e.getDepartmentName()+"\n"));
	}
	
	//•	List employee name, hire date and day of week on which employee has started. 
	public void getEmpNameHireDateAndDayOfWeekOfStarting() {
		System.out.format("%25s|%10s|%6s\n"
				+ "------------------------------------------------------------\n","Name","HireDate","Day of week of starting");
		EmployeeRepository.list.stream().forEach(e -> System.out.format("%25s|%10s|%6s\n",e.getFullName(), e.getHireDate(),e.getHireDate().getDayOfWeek())) ;

	}
	
	//•	List employee name, hire date and day of week for employee started on Friday. (Hint:  Accept the day name for e.g. FRIDAY and list all employees joined on Friday)
	public void getEmpNameHireDateAndDayOfWeekOfStartingIsFriday() {
		System.out.format("%25s|%10s\n"
				+ "------------------------------------------------------------\n","Name","HireDate");
		EmployeeRepository.list.stream()
		.filter(e -> e.getHireDate().getDayOfWeek().toString()=="FRIDAY")
		.forEach(e -> System.out.format("%25s|%10s\n",e.getFullName(), e.getHireDate())) ;

	}
	//get Employee name by Id
	public String getEmployeeNameById(int id) {
		return EmployeeRepository.list.stream()
				.filter(e -> e.getEmployeeId()==id)
				.findAny().get().getFullName();
	}
	//•	List employee’s names and name of manager to whom he/she reports. Create a report in format “employee name reports to manager name”.
	public void getEmployeeManagerDetails() {
		EmployeeRepository.list.stream()
				.filter(Employee -> Employee.getManagerId() != null)
				.collect(Collectors.toList())
				.forEach(e->System.out.println(e.getFullName()+" reports to "+ getEmployeeNameById(e.getManagerId())));
		        
	}
	//•	Find employees who didn’t report to anyone (Hint: Employees without manager)
	public void getEmployeeWithoutManager() {
		System.out.format("%25s\n"
				+ "-------------------------\n","Name");
		EmployeeRepository.list.stream()
		.filter(e -> e.getManagerId() == null)
		.forEach(e -> System.out.format("%25s\n",e.getFullName())) ;
	}
	//•	Create a method to accept first name and last name of manager to print name of all his/her subordinates.  
	public void getEmployeeByManagerName() {
		System.out.print("Enter first name: ");
		String fn = sc.next();
		System.out.print("Enter last name: ");
		String ln = sc.next();
		System.out.println("Subordinates of "+fn+" "+ln+":");
		
		int mangId = EmployeeRepository.list
				.stream()
				.filter(e -> e.getFullName().equals(fn+" "+ln))
				.findAny().get().getEmployeeId();
		EmployeeRepository.list
		.stream()
		.filter(e->e.getManagerId()!=null && e.getManagerId()==mangId)
		.forEach(e->System.out.println(e.getFullName()));
	}
	//sort employees by id
	public void sortEmployeeById() {
		EmployeeRepository.list
		.stream() 
        .sorted((p1, p2) -> p1.getEmployeeId() - p2.getEmployeeId())
        .collect(Collectors.toList())
        .forEach(e->System.out.println(e));
	}
	//sort employees by department id
	public void sortEmployeeByDepartmentId() {
		EmployeeRepository.list
		.stream() 
		.filter(e -> e.getDepartment()!= null)
        .sorted((p1, p2) -> p1.getDepartment().getDepartmentId() - p2.getDepartment().getDepartmentId())
        .collect(Collectors.toList())
        .forEach(e->System.out.println(e));
	}
	
	//sort employees by name
	public void sortEmployeeByName() {
		EmployeeRepository.list
		.stream() 
        .sorted((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName())) 
        .collect(Collectors.toList())
        .forEach(e->System.out.println(e.getFullName()));
	}
	
}
