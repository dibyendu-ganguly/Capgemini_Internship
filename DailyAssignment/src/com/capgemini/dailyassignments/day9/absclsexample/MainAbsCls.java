/**
 * 
 */
package com.capgemini.dailyassignments.day9.absclsexample;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class MainAbsCls {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		//SavingsAccount sa = new SavingsAccount();
		
	
		
		
			System.out.println("Enter the choice");
			System.out.println("1 for Savings account");
			System.out.println("2 for Fixed Deposit");
			System.out.println("3 for Current Account");
			int acOption = sc.nextInt();
			switch (acOption) {
			case 1:
				SavingsAccount sa = new SavingsAccount();
				while (ch == 'y') {
					System.out.println("Enter the choice");
					System.out.println("addMoney");
					System.out.println("withDrawMoney");
					System.out.println("CheckBal");
					String option = sc.next();
					switch (option) {
					case "addMoney":
						sa.addMoney();
						break;
					case "withDrawMoney":
						sa.withDraw();
						break;
					case "CheckBal":
						sa.checkBalance();
						break;
					default:
						System.out.println("Not valid option");

					}// switch close
					System.out.println("do you want to continue");
					ch = sc.next().trim().charAt(0);
				} // while close
				break;
			case 2:
				FixedDeposit fd = new FixedDeposit();
				while (ch == 'y') {
					System.out.println("Enter the choice");
					System.out.println("addMoney");
					System.out.println("withDrawMoney");
					System.out.println("CheckBal");
					String option = sc.next();
					switch (option) {
					case "addMoney":
						fd.addMoney();
						break;
					case "withDrawMoney":
						fd.withDraw();
						break;
					case "CheckBal":
						fd.checkBalance();
						break;
					default:
						System.out.println("Not valid option");

					}// switch close
					System.out.println("do you want to continue");
					ch = sc.next().trim().charAt(0);
				} // while close
				break;
			case 3:
				CurrentAccount ca = new CurrentAccount();
				while (ch == 'y') {
					System.out.println("Enter the choice");
					System.out.println("addMoney");
					System.out.println("withDrawMoney");
					System.out.println("CheckBal");
					String option = sc.next();
					switch (option) {
					case "addMoney":
						ca.addMoney();
						break;
					case "withDrawMoney":
						ca.withDraw();
						break;
					case "CheckBal":
						ca.checkBalance();
						break;
					default:
						System.out.println("Not valid option");

					}// switch close
					System.out.println("do you want to continue");
					ch = sc.next().trim().charAt(0);
				} // while close
				break;
			default:
				System.out.println("Not valid option");

			}// switch close
			

		
		
		
		
		sc.close();
	}// main method close
	

}
