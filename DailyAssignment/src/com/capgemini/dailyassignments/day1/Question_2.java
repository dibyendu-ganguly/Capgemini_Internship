/*
 * 
 * 2.Write a Java Program to find where given number has duplicated digits or not?
 * print the duplicate number?
 * hint: 144 = 4 is duplicated
 * 
 * */
package com.capgemini.dailyassignments.day1;
import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check if it has duplicated digits or not:");
		int n=sc.nextInt();
		int temp=n, flag=0;
		int a[]=new int [10];
		while(temp!=0)
		{
			int d=temp%10;
			a[d]++;
			temp/=10;
		}

		for(int i=0;i<10;i++)
		{
			if(a[i]>1)
			{
				flag = 1;
				System.out.println("Digit "+i+" is repeated "+a[i]+" times.");
			}
		}
		if(flag==0) {
			System.out.println("No digit is duplicated in the number"+n);
		}
		sc.close();
	}

}