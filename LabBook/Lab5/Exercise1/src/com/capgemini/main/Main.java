/**
 * 
 */
package com.capgemini.main;

import java.util.Scanner;

import com.capgemini.exceptions.AgeNotValidException;
import com.capgemini.service.AgeValidation;


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
		AgeValidation av = new AgeValidation();
		//Person p = new Person();
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		do {
			try {
				System.out.println("Enter the age of the person:");
				int age = sc.nextInt();
				sc.nextLine();
				av.validateAge(age);
				System.out.println(age+" is a valid age of the person");		
			} catch (AgeNotValidException e) {
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
