/**
 * 
 */
package com.capgemini.ex3;

import java.util.Scanner;

/**
 * @author DIBYENDU
 *
 */

public class Exercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Authenticator a = (n,p) ->{
			String reqName = "Dibyendu48";
			String reqPass = "Dibyendu@48!";
			if(n.equals(reqName) && p.equals(reqPass))
				System.out.println("Authentication successful");
			else
				System.out.println("Authentiction unsuccessfull");
		};
		System.out.println("Enter the username:");
		String name = sc.nextLine();
		System.out.println("Enter the password:");
		String password = sc.nextLine();
		a.auth(name, password);
		sc.close();
	}

}
