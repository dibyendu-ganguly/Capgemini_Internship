/**
 * 
 */
package com.capgemini.ex5;

import java.util.Scanner;

/**
 * @author DIBYENDU
 *
 */
public class Exercise5 {
	public int fact(int num) {
		int res=1;
		for(int i=1;i<=num;i++)
			res = res * i;
		return res;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Exercise5 e = new Exercise5();
		
		FactorialInterface f  = e::fact;
		System.out.println("Enter the number to get it's factorial:");
		int num = sc.nextInt();
		int result = f.test(num);
		System.out.println("Factorial of "+num+" is : "+result);
		sc.close();
	}

}
