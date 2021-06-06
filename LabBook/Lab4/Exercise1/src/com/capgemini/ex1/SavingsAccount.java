/**
 * 
 */
package com.capgemini.ex1;

/**
 * @author DIBYENDU
 *
 */
public class SavingsAccount extends Account {
	final long minimumBalance = 500;
	
	public void withdraw(double amount) {
		if((balance-amount)<minimumBalance) {
			System.out.println("Can not withdraw "+amount+"Available amount is :"+balance);
		}
		else {
			balance = balance - amount;
			System.out.println("Amount withdrawn: "+amount+"Available amount is :"+balance);
		}
	}
}
