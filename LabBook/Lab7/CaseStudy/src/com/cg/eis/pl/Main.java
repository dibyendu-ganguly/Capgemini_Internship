/**
 * 
 */
package com.cg.eis.pl;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.eis.service.EmployeeServiceClass;

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
		Scanner sc = new Scanner(System.in);
		EmployeeServiceClass e = new EmployeeServiceClass();
		char ch = 'y';
		int choice = 0;
		
		do {
			System.out.println("------------"
					+"\nEnter choice"
					+"\n------------"
					+"\n1. Add an Employee to HashMap"
					+"\n2. View Employee Details by Insurance scheme"
					+"\n3. Delete Employee by Id");
			try {
				choice = sc.nextInt();
				sc.nextLine();
			}
			catch(InputMismatchException ex){
				System.out.println(ex +" : Enter only a integer for choice!");
				sc.nextLine();
				//e.printStackTrace();
				continue;
			}
			switch(choice) {
			case 1:
				try {
					e.addEmployee();
				} catch(Exception ex) {
					System.out.println(ex);
				}
				break;
			case 2:
				e.displayEmployeeDetailsByInsuranceScheme();
				break;
			case 3:
				e.delEmployeeById();
				break;
			default:
				System.out.println("Please enter a valid option");
				break;
			}
			System.out.println("Enter 'y' to continue:");
			ch = sc.next().charAt(0);
		}while(ch == 'y');
		System.out.println("\n---\nEnd\n---");
		sc.close();
	}

}
