/**
 * 
 */
package com.capgemini.cmapp;



/**
 * @author DIBYENDU
 *
 */
import java.util.Collection;
import java.util.Scanner;

import com.capgemini.cmapp.model.Contact;
import com.capgemini.cmapp.service.ContactManager;

public class ContactMain {

	static Scanner ip=new Scanner(System.in);
	static String fname;
	static String lname;
	static String phno;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactManager cm=new ContactManager();
		char choice='y';
		while(choice=='y'){
			System.out.println("Enter the choice");
			System.out.println("a:add contact");
			System.out.println("g:get contact list");
			char ch=ip.next().charAt(0);
			switch(ch){
			case 'a':
				readDetails();
				cm.addContact(fname, lname, phno);
				break;
			case 'g':
				Collection<Contact> data=cm.getAllContacts();
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
		System.out.println("Enter the contact details:");
		System.out.println("Enter the first name :");
		fname=ip.next();
		System.out.println("Enter the last name :");
		lname=ip.next();
		System.out.println("Enter the phone number :");
		phno=ip.next();
	}
}
