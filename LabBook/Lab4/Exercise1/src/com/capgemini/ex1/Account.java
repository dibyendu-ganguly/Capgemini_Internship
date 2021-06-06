/**
 * 
 */
package com.capgemini.ex1;

/**
 * @author DIBYENDU
 *
 */
public class Account {

	/**
	 * 
	 */
	protected long accNum;
	protected double balance;
	public Person accHolder = new Person();
	private static int nextAccountNumber = 10000000;
	
	public long getAccNum() { return accNum; }
    public double getBalance() { return balance; }

    public void setAccNum() { this.accNum = ++nextAccountNumber; }
    public void setBalance(double balance) { this.balance = balance; }
    
    public void deposit(double amount) {
    	balance = balance + amount;
    }
    public void withdraw(double amount) {
    	balance = balance - amount;
    }
    

}