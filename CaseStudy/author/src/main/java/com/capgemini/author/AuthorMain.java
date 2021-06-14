/**
 * 
 */
package com.capgemini.author;

import java.util.Collection;
import java.util.Scanner;

import com.capgemini.author.model.Author;
import com.capgemini.author.serivice.AuthorManager;



/**
 * @author DIBYENDU
 *
 */
public class AuthorMain {

	/**
	 * @param args
	 */
	static Scanner ip=new Scanner(System.in);
	static String name;
	static String email;
	static char gender;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthorManager am=new AuthorManager();
		char choice='y';
		while(choice=='y'){
			System.out.println("Enter the choice");
			System.out.println("A:add Author");
			System.out.println("G:get Author list");
			char ch=ip.next().charAt(0);
			switch(ch){
			case 'a':
				readDetails();
				am.addAuthor(name, email, gender);
				break;
			case 'g':
				Collection<Author> data=am.getAllAuthors();
				System.out.println(data);
				break;
			case 'f':
				System.out.println("code here to find a contact by key");
				break;
			case 'u':
				break;
			case 'r':
				break;
			default:
				break;
			}//switch close
			System.out.println("Do you want to continue");
			choice=ip.next().charAt(0);
		}//while close

	}
	public static void readDetails(){
		System.out.println("Enter the author details\n------------------");
		System.out.println("Enter the first name :");
		name=ip.next();
		System.out.println("Enter the email :");
		email=ip.next();
		ip.nextLine();
		System.out.print("Enter the gender :");
		gender=ip.nextLine().charAt(0);
	}

}
