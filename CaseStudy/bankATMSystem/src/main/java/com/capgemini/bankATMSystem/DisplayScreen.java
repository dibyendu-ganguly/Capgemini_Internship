package com.capgemini.bankATMSystem;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.bankATMSystem.service.ATM;
import com.capgemini.bankATMSystem.service.Account;

public class DisplayScreen {

	public static void main(String[] args)
	{
		char ch = 'y';
		int accNo = 0;
		String accType;
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account();
		ArrayList<Account> savingsList = new ArrayList<Account>();
		ArrayList<Account> currentList = new ArrayList<Account>();
		
		while(ch == 'y')
		{
			System.out.println("Enter your choice:");
			System.out.println("1) Add new Customer\n"
					+ "2) Display Customer Details\n"
					+ "3) Start Transaction\n");
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1://Add new customer
				System.out.println("Which Account do you want to open?");
				System.out.println("1) Savings\n"
						+ "2) Current");
				sc.nextLine();
				accType = sc.nextLine();
				if(accType.equalsIgnoreCase("Savings"))
					savingsList = acc.addCustomer(accType);
				else
					currentList = acc.addCustomer(accType);
				System.out.println();
				break;
			case 2://Display Details
				System.out.println("Enter Account Number:");
				accNo = sc.nextInt();
				System.out.println("Savings or Current Account?");
				accType = sc.next();
				if(accType.equalsIgnoreCase("Savings"))
					acc.displayDetails(savingsList, accNo);
				else
					acc.displayDetails(currentList, accNo);
				System.out.println();
				break;
			case 3:new ATM().transact(savingsList, currentList);
				break;
			default:System.out.println("Invalid Choice!!!");
			break;
			}
			
			System.out.println("Do you wish to continue?(y/n):");
			ch = sc.next().charAt(0);
		}
		
		System.out.println("Thank You");
		sc.close();
	}
}
