/**
 * 
 */
package com.cg.eis.main;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.SalaryValidation;




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
		SalaryValidation sv = new SalaryValidation();
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		do {
			try {
				System.out.println("Enter the salary of the Person:");
				int sal = sc.nextInt();
				sc.nextLine();
				sv.salaryValidate(sal); 
				System.out.println(sal+" is a valid salary of an employee");		
			} catch (EmployeeException e) {
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
