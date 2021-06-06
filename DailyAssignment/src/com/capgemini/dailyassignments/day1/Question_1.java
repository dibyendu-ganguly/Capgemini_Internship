/*
 *
 * 1.Write a Java Program to find where given number is strong number or not?
 * hint: 145 = 1! + 4! + 5! = 145
 * 
 * */
package com.capgemini.dailyassignments.day1;
import java.util.Scanner;
public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if it is a Strong Number or not: ");
		int num = sc.nextInt();
		int sum=0,d,temp=num,fact;
		while(num>0)
		{
			 d=num%10;
			 fact=1;
			 for(int i=1;i<=d;i++)
			 {
				 fact=fact*i;
			 }
			 sum=sum+fact;
			 num=num/10;
			}
		if(sum==temp)
			System.out.println(num+" is a Strong Number");
		else
			System.out.println(num+" is not a Strong Number");
		
		sc.close();
	}

}
