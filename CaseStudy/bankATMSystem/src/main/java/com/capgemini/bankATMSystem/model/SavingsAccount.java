package com.capgemini.bankATMSystem.model;

import java.util.ArrayList;

import com.capgemini.bankATMSystem.service.Account;

//import java.util.ArrayList;

public class SavingsAccount extends Account{


	public void displayBalance(ArrayList<Account> custList, int no)
	{
		for(int i=0; i<custList.size(); i++)
		{
			if(custList.get(i).getAccNumber() == no)
			{
				System.out.println("Acc_Type: "
						+ custList.get(i).getAccType()
						+"\nBalance: " 
						+ custList.get(i).getBalance());
				return;
			}
		}
		System.out.println("Account not Found!!!");
	}
}
