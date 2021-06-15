package com.capgemini.bankATMSystem.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.bankATMSystem.model.CurrentAccount;
import com.capgemini.bankATMSystem.model.SavingsAccount;

public class ATM {
 
	public void transact(ArrayList<Account> savingsList, 
			ArrayList<Account> currentList){
		// TODO Auto-generated method stub
		
		int accNo = 0;
		String pin;
		int amt = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Transaction t = new Transaction();
		
		System.out.println("Savings or Current Account?");
		String accType = sc.next(); 
		
		System.out.println("Enter Account No:");
		accNo = sc.nextInt();
		System.out.println("Enter PIN:");
		pin = sc.next();
		
		if(accType.equalsIgnoreCase("Savings"))
		{
			if(t.checkCredentials(savingsList, accNo, pin))
			{
				System.out.println("Enter Your Choice:");
				System.out.println("1) Withdraw\n"
						+ "2) Deposit\n"
						+ "3) Check Balance\n"
						+ "4) Change PIN");
				
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1://Withdraw Amount
					System.out.println("Enter Withdraw Amount:");
					amt = sc.nextInt();
					t.withdrawAmt(savingsList, accNo, amt);
					System.out.println();
					break;
				case 2://Deposit Amount
					System.out.println("Enter Amount to Deposit:");
					amt = sc.nextInt();
					t.depositAmount(savingsList, accNo, amt);
					System.out.println();
					break;
				case 3://Check Balance
					new SavingsAccount().displayBalance(savingsList, accNo);
					System.out.println();
					break;
				case 4://Change PIN
					t.changePin(savingsList, accNo);
					System.out.println();
					break;
				default:System.out.println("Invalid Choice...");
					System.out.println();
					break;
				
				}
			}
		}
		else
		{
			if(t.checkCredentials(currentList, accNo, pin))
			{
				System.out.println("Enter Your Choice:");
				System.out.println("1) Withdraw\n"
						+ "2) Deposit\n"
						+ "3) Check Balance\n"
						+ "4) Change PIN");
				
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1://Withdraw Amount
					System.out.println("Enter Withdraw Amount:");
					amt = sc.nextInt();
					t.withdrawAmt(currentList, accNo, amt);
					System.out.println();
					break;
				case 2://Deposit Amount
					System.out.println("Enter Amount to Deposit:");
					amt = sc.nextInt();
					t.depositAmount(currentList, accNo, amt);
					System.out.println();
					break;
				case 3://Check Balance
					new CurrentAccount().displayCurrentBalance(currentList, accNo);
					System.out.println();
					break;
				case 4://Change PIN
					t.changePin(currentList, accNo);
					System.out.println();
					break;
				default:System.out.println("Invalid Choice...");
					System.out.println();
					break;
				
				}
			}
		}
	}

}
