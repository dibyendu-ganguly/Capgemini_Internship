/**
 * Write a program to validate username and password and email and mobileno and city and pincode?
 * a) username should be greater than 8 characters should contain atleast one spl character either _,-,.
 * b) validate email 
 * c) validate the password ,which should contain 8 characters with atleast one spl character
 * d) city should contain only alphabets
 * e) pincode should contain only 6 digits
 * f) mobile number should start with either 7,8,9 and length of 10 
 */
package com.capgemini.dailyassignments.day7;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
import java.util.regex.*;
public class FormValidation {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Username: ");
		String username = sc.nextLine();
		String regexUsername = "(?=.[A-Za-z])(?=.*[0-9])(?=.*[\\._-]).{7,}$";											
		Pattern patternUsername = Pattern.compile(regexUsername);
		Matcher matcherUsername = patternUsername.matcher(username);
		if(matcherUsername.matches())
			System.out.println("The Username is valid");
		else
			System.out.println("The Username is not valid");
		
		
		System.out.print("Enter the Email: ");
		String email = sc.nextLine();
		String regexEmail = "^[A-Za-z0-9+_.-]+@(.+)$";											
		Pattern patternEmail = Pattern.compile(regexEmail);
		Matcher matcherEmail = patternEmail.matcher(email);
		if(matcherEmail.matches())
			System.out.println("The Email is valid");
		else
			System.out.println("The Email is not valid");
		
		System.out.print("Enter the Password: ");
		String password = sc.nextLine();
		String regexPassword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8, 20}$";											
		Pattern patternPassword = Pattern.compile(regexPassword);
		Matcher matcherPassword = patternPassword.matcher(password);
		if(matcherPassword.matches())
			System.out.println("The Password is valid");
		else
			System.out.println("The Password is not valid");
		System.out.print("Enter the City: ");
		String city = sc.nextLine();
		String regexCity = "^([a-zA-Z\\u0080-\\u024F]+(?:. |-| |'))*[a-zA-Z\\u0080-\\u024F]*$";											
		Pattern patternCity = Pattern.compile(regexCity);
		Matcher matcherCity = patternCity.matcher(city);
		if(matcherCity.matches())
			System.out.println("The City name is valid");
		else
			System.out.println("The City name is not valid");
		System.out.print("Enter the Pincode: ");
		String pincode = sc.nextLine();
		String regexPin = "^([a-zA-Z\\u0080-\\u024F]+(?:. |-| |'))*[a-zA-Z\\u0080-\\u024F]*$";											
		Pattern patternPin = Pattern.compile(regexPin);
		Matcher matcherPin = patternPin.matcher(pincode);
		if(matcherPin.matches())
			System.out.println("The Pincode is valid");
		else
			System.out.println("The Pincode is not valid");
		System.out.print("Enter the Mobile number: ");
		String mobile = sc.nextLine();
		String regexMobile = "[6-9][0-9]{9}";											
		Pattern patternMobile = Pattern.compile(regexMobile);
		Matcher matcherMobile = patternMobile.matcher(mobile);
		if(matcherMobile.matches())
			System.out.println("The Mobile number is valid");
		else
			System.out.println("The Mobile number is not valid");
		
		
		sc.close();
	}

}
