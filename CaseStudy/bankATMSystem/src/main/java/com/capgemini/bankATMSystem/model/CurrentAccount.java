package com.capgemini.bankATMSystem.model;

import java.util.ArrayList;

import com.capgemini.bankATMSystem.service.Account;

public class CurrentAccount extends Account{

	public void displayCurrentBalance(ArrayList<Account> custList,
			int no)
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
