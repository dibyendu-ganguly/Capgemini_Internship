package com.capgemini.dailyassignments.day1;
/*
 * 
 * 4.Write a Java program to classify Abundant, deficient and perfect number (integers) 
 * between 1 to 10,000.
 * Hint : The integer 12 is the first abundant number. 
 * Its proper divisors are 1, 2, 3, 4 and 6 for a total of 16.
 * Divisors of 21 are 1, 3 and 7, and their sum is 11. 
 * Because 11 is less than 21, the number 21 is deficient. 
 * Its deficiency is 2 × 21 − 32 = 10.
 * 
 * */

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<10000;i++)
		{
			if(i==1)
				System.out.println("1 is neither perfect nor abundant nor deficit");
			else
			{
				int sum=0;
				for(int j=1;j<=(i/2);j++)
				{
				if(i%j==0)
				sum+=j;
				}
				if(sum==i)
					System.out.println(i+" is a Perfect number \n");
				else if(sum<i)
					System.out.println(i+" is a Deficient number \n");
				else
					System.out.println(i+" is an Abundant number \n");
			}


		}

	}
}