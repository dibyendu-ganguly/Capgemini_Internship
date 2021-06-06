/*
 * 
 * 3.Write a Java program to find whether give number is perfect or not?
 * hint : a positive integer equal to sum of proper divisors.
 * 6 = 1 + 2 + 3,28 = 1+2+7+4+14
 *         
 * 
 * */
package com.capgemini.dailyassignments.day1;
import java.util.Scanner;
public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if it is a perfect number or not: ");
		int num=sc.nextInt();
		sc.close();
		int i,sum=0;
		for(i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==num)
			System.out.println(num+" is a Perfect number");
		else
			System.out.println(num+" is not a Perfect number");
		
		
	}

}
