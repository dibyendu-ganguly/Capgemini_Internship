/**
 * 
 */
package com.capgemini.dailyassignments.day8.PolymorphisomCaseStudy2;


/**
 * @author DIBYENDU
 *
 */

public class Transaction {
	protected int accountNumber;
	protected double balance;
	
	private static int nextAccountNumber = 100000;
	
	public long getAccontNumber() { return accountNumber; }
	public double getBalance() { return balance; }
	
    public void setAccontNumber() { this.accountNumber = ++nextAccountNumber; }
    public void setBalance(double balance) { this.balance = balance; }
    
    public double execute() {
    	return balance;
    }
  

}
