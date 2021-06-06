/*
 * 10.  Write a Java program to check whether a number is a Harshad Number or not.
In recreational mathematics, a harshad number in a given number base, 
is an integer that is divisible by the sum of its digits when written in that base.
Example: Number 200 is a Harshad Number 
because the sum of digits 2 and 0 and 0 is 2(2+0+0) and 200 is divisible by 2. 
Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1) 
and 171 is divisible by 9.
Expected Output

Input a number : 353  
                                                  
353 is not a Harshad Number.

 * */
package com.capgemini.dailyassignments.day1;
import java.util.Scanner;
public class Question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check if it is a Harshad Number or not: ");
		int n=sc.nextInt();
		System.out.print("Enter the base of the number: ");
		int b=sc.nextInt();
		int temp=n,digSum=0;
		while(temp!=0) {
			digSum += temp%b;
			temp = temp/b;
		}
		if(n % digSum==0) {
			System.out.println(n+" (base: "+b+") is a Harshad Number");
		}
		else {
			System.out.println(n+" (base: "+b+") is not a Harshad Number");
		}
		
		sc.close();
	
	}
}
