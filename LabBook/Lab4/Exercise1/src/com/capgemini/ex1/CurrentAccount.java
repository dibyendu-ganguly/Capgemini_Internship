/**
 * 
 */
package com.capgemini.ex1;

/**
 * @author DIBYENDU
 *
 */
public class CurrentAccount extends Account{
final long overDraftLimit = 500;
	
	public void withdraw(double amount) {
		if(amount>overDraftLimit) {
			System.out.println("Can not withdraw "+amount+"Overdraft limit is :"+overDraftLimit);
		}
		else {
			balance = balance - amount;
			System.out.println("Amount withdrawn: "+amount+"; Available amount is :"+balance);
		}
	}

}
