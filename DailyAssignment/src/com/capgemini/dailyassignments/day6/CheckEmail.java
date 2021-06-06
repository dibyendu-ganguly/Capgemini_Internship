/**
 * 
 * Write a java program to check given email contains @ and .?
 * 
 */
package com.capgemini.dailyassignments.day6;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class CheckEmail {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the email: ");
		String email = sc.nextLine();
		char[] ch = new char[email.length()];
		int flag=0;
		for (int i = 0; i < email.length(); i++) {
	            ch[i] = email.charAt(i);
	            if(ch[i]=='@')
	            	flag+=2;
	            if(ch[i] == '.')
	            	flag+=3;
	    }
		if(flag==5)
			System.out.println("The email contains both @ and .");
		else if(flag==2)
			System.out.println("The email contain only @");
		else if(flag==3)
			System.out.println("The email contain only .");
		else
			System.out.println("The email does not contain @ and .");
		
		sc.close();
	}

}
