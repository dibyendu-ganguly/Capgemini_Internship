/**
 * 
 */
package com.capgemini.main;

import java.util.Scanner;

import com.capgemini.exceptions.FirstNameNotValidException;
import com.capgemini.exceptions.LastNameNotValidException;
import com.capgemini.service.NameValidation;



/**
 * @author DIBYENDU
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameValidation nv = new NameValidation();
		//Person p = new Person();
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		do {
			try {
				System.out.println("Enter the First Name of the Person:");
				String fname = sc.nextLine();
				nv.validateFirstName(fname);
				System.out.println(fname+" is a valid first name of person");		
			} catch (FirstNameNotValidException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e);
				System.out.println("Enter Y to try again:");
				ch = sc.nextLine().charAt(0);
				if(ch=='y')
				continue;
			}
			break;
		}while(true);
		
		do {
			try {
				System.out.println("Enter the Last Name of the Person:");
				String lname = sc.nextLine();
				nv.validateLastname(lname);
				System.out.println(lname+" is a valid last name of person");		
			} catch (LastNameNotValidException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e);
				System.out.println("Enter Y to try again:");
				ch = sc.nextLine().charAt(0);
				if(ch=='y')
				continue;
			}
			break;
		}while(true);
				
		sc.close();
	}

}
