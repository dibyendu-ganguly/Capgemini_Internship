package com.capgemini.dailyassignments.day1;
/*
 * 
 *9. 11. Write a Java program to check 
whether a given number is a Disarium number or unhappy number.
A Disarium number is a number defined by the following process :
Sum of its digits powered with their respective position is equal to the original number.
For example 175 is a Disarium number :
As 11+32+53 = 135
Some other DISARIUM are 89, 175, 518 etc.
A number will be called Disarium if the sum of its digits powered with their respective position 
is equal with the number itself. 
Sample Input: 135.
Expected Output

Input a number : 25                                                     
Not a Disarium Number. 
 * 
 * */
import java.util.Scanner;
public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if it is a Disarium number or not: ");
		int num=sc.nextInt();
		int temp=num,reqSum=0,digCount=0,digit,i=1;
		while(temp!=0) {
			temp=temp/10;
			digCount++;
		}
		temp=num;
		int div=(int)Math.pow(10, digCount-1);
		//System.out.println("div:"+div);
		while(i!=digCount+1) {
			//System.out.println(temp);
			digit=(temp/div);
			//System.out.println("d:"+digit+"   power:"+i+" div: "+div);
			//System.out.println(temp);
			//System.out.println("i:"+(int)Math.pow(digit,i));
			reqSum = reqSum + (int)Math.pow(digit, i);
			temp=temp%div;
			div=div/10;
			i++;
		}
		//System.out.println(reqSum);
		if(reqSum==num)
			System.out.println(num+" is a Disarium number");
		else
			System.out.println(num+" is not a Disarium number");
		
		sc.close();

	}

}
