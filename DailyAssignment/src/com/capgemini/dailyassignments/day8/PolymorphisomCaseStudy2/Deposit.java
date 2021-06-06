/**
 * 
 */
package com.capgemini.dailyassignments.day8.PolymorphisomCaseStudy2;

/**
 * @author DIBYENDU
 *
 */
public class Deposit extends Transaction{
	private double amount;
	public void execeute() {
    	balance = balance - amount;
    }

}
