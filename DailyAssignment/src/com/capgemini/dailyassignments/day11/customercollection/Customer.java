/**
 * 
 * Create a class called Customer (cid,custname,age,dob,email,mobilenumber)
 * using arraylist create list of customers
 * and while reading the data for the customer validate age(!=0,<0,>100,only digits)
                                               validate mobilenumber
                                               validate email
                                               cid cannot be zero or null or negativevalue and only digits
                                               custname should contain only character
 */
package com.capgemini.dailyassignments.day11.customercollection;

import java.time.Month;
//import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author DIBYENDU
 *
 */
public class Customer {
	Scanner sc = new Scanner(System.in);
	private int cid ;
	private String custname;
	private int age;
	private int day;
	private Month month;
	private int year;
	private String email;
	private String mobile;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String custname, int age, int day, Month month, int year, String email, String mobile) {
		super();
		this.cid = cid;
		this.custname = custname;
		this.age = age;
		this.day = day;
		this.month = month;
		this.year = year;
		this.email = email;
		this.mobile = mobile;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public boolean validateName(String un) {
		if(un == null || un.equals("")) {
			System.out.println("Name cannot be null");
			return false;
		}else {
			String userNamePattern = "[A-Za-z\s]*";
			Pattern pat=Pattern.compile(userNamePattern);
			Matcher matcher = pat.matcher(un);
			boolean username_result = matcher.matches();
			if(!username_result) {
				System.out.println("Entered name does not follow the required format");
				return false;
			}
			else {
				return true;
			}
		}
	}
	
	public boolean validateEmail(String email) {
		if(email == null || email.equals("")) {
			System.out.println("Email cannot be null");
			return false;
		}
		else {
			String emailPattern = "^(.+)@(.+)\\.(.+)$";
			Pattern pat=Pattern.compile(emailPattern);
			Matcher matcher = pat.matcher(email);
			boolean email_result = matcher.matches();
			if(!email_result) {
				System.out.println("Entered email does not follow the required format");
				return false;
			}
			else {
				return true;
			}
			
		}
	}
	public boolean validateAge(int age) {
		if(age>100) {
			System.out.println("Date of birth is greater than current date! Age cannot be greater than 100");
			return false;
		}
		else if(age<=0) {
			System.out.println("Age cannot be zero or negative");
			return false;
		}
		else
			return true;
	}
	
	public boolean validateMobile(String no) {
		String mobilePattern = "(0|91)?[6-9][0-9]{9}";
		Pattern pat = Pattern.compile(mobilePattern);
		Matcher matcher = pat.matcher(no);
		boolean mobile_result = matcher.matches();
		if(!mobile_result) {
			System.out.println("Mobile number is not valid");
			return false;
		}
		else
			return true;
	}
	public String readName() {
		System.out.print("Enter the name:");
		
		//sc.nextLine();
		String name = sc.nextLine();
		while(!validateName(name)) {
			System.out.print("Enter the name: ");
			name = sc.nextLine();
		}
		
		return name;
	}
	
	public String readEmail() {
		System.out.print("Enter the email:");
		
		//sc.nextLine();
		String email = sc.nextLine();
		while(!validateEmail(email)) {
			System.out.print("Enter the email: ");
			email = sc.nextLine();
		}
		
		return email;
	}
	
	public String readMobile() {
		System.out.print("Enter the Mobile number:");
		//sc.nextLine();
		String mobile = sc.nextLine();
		while(!validateMobile(mobile)) {
			System.out.print("Enter the Mobile number: ");
			 mobile = sc.nextLine();
		}
		
		return mobile;
	}
	
	/*public Customer updateCustomer(ArrayList<Customer> cust) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Want to Update name? Yes or No");
		String choiceUpdate=sc.nextLine();
		if(choiceUpdate.equalsIgnoreCase("yes")) {
			System.out.println("Enter new name:");
			sc.nextLine();
			String name = sc.nextLine();
			while(!validateName(name)) {
				System.out.print("Enter the name: ");
				name = sc.nextLine();
			}
		}
		
		
		sc.close();
		return cust;
	}*/
	


}
