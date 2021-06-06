/**
 * 
 */
package com.capgemini.ex1;
/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account();
		Account acc2 = new Account();
		Scanner sc = new Scanner(System.in);
		//String name = sc.nextLine();
		
		String name1 = "Smith";
		String name2 = "Kathy";
		
		acc1.accHolder.setName(name1);
		System.out.println("New account opened for "+acc1.accHolder.getName());
		acc1.setAccNum();
		System.out.println("Account number for "+acc1.accHolder.getName()+" : "+acc1.getAccNum());
		acc1.setBalance(2000);
		System.out.println("Inital Balance of "+acc1.accHolder.getName()+"'s account: "+acc1.getBalance());
		
		acc2.accHolder.setName(name2);
		System.out.println("New account opened for "+acc2.accHolder.getName());
		acc2.setAccNum();
		System.out.println("Account number for "+acc2.accHolder.getName()+" : "+acc2.getAccNum());
		acc2.setBalance(3000);
		System.out.println("Initial Balance of "+acc2.accHolder.getName()+"'s account: "+acc2.getBalance());
		
		
		
		acc1.deposit(2000);
		System.out.println("Amount of Rs. 2000 credited to "+acc1.accHolder.getName()+"'s account; Account No:"+acc1.getAccNum());
		System.out.println("Balance of "+acc1.accHolder.getName()+"'s account: "+acc1.getBalance());
		
		acc2.withdraw(2000);
		System.out.println("Amount of Rs. 2000 debited from "+acc2.accHolder.getName()+"'s account; Account No:"+acc2.getAccNum());
		System.out.println("Balance of "+acc2.accHolder.getName()+"'s account: "+acc2.getBalance());

		sc.close();
	}

}
