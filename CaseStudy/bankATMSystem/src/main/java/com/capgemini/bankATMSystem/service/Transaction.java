package com.capgemini.bankATMSystem.service;

import java.util.ArrayList;

//import java.util.ArrayList;

public class Transaction extends Account{ 

	private static double withdrawLimit = 50000;
	
	public Transaction() {
		super();
	}
	
	public void withdrawAmt(ArrayList<Account> custList, int no, double amount)
	{
		if(amount <= withdrawLimit)
		{
			for(int i=0; i<custList.size(); i++)
			{
				if(custList.get(i).getAccNumber() == no)
				{
					custList.get(i).setBalance(custList.get(i).getBalance() - amount);
					System.out.println("Acc_Type: "
							+ custList.get(i).getAccType()
							+"\nBalance: " 
							+ custList.get(i).getBalance());
					return;
				}
			}
			System.out.println("Account not found!!!");
			System.out.println();
			return;
		}
		else
			System.out.println("Exceeding Withdraw Limit!!!");
	}
	
	public void depositAmount(ArrayList<Account> custList, int no, double amount)
	{
		for(int i=0; i<custList.size(); i++)
		{
			if(custList.get(i).getAccNumber() == no)
			{
				custList.get(i).setBalance(custList.get(i).getBalance() + amount);
				System.out.println("Acc_Type: "
						+ custList.get(i).getAccType()
						+"\nBalance: " 
						+ custList.get(i).getBalance());
				return;
			}
		}
		System.out.println("Account not found!!!");
		System.out.println();
	}
	
	public boolean checkCredentials(ArrayList<Account> custList, int no, String pin)
	{
		for(int i=0; i<custList.size(); i++)
		{
			if(custList.get(i).getAccNumber() == no && (custList.get(i).getPin()).equals(pin))
				return true;
		}
		return false;
	}
	
}
