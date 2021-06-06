package com.capgemini.dailyassignments.day1;
/*
 * 
 * 
8. Write a Java program to find and print the first 10 happy numbers.
Happy number: Starting with any positive integer, replace the number 
by the sum of the squares of its digits, and 
repeat the process until the number equals 1, 
or it loops endlessly in a cycle which does not include 1.
Example: 19 is a happy number
12 + 92=82
82 + 22=68
62 + 82=100
12 + 02 + 02=1

Expected Output

First 10 Happy numbers:                                                 
1                                                                       
7                                                                       
10                                                                      
13                                                                      
19                                                                      
23                                                                      
28                                                                      
31 
 * 
 */
public class Question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sqSum,n,count=0,i=1;
		System.out.println("First 10 Happy numbers:");
		while(count<10) {
			n=i;
			while(n!=2 && n!=3 ) {
				sqSum=0;
				while (n!= 0)
			    {
			        sqSum += (n % 10) * (n % 10);
			        n /= 10;
			    }
				
				if(sqSum==1) {
			    	System.out.println(i);
			    	count++;
			    	break;
			    }
				if(sqSum==4) {
			    	break;
			    }
				
				n=sqSum;
				
			}
			i++;
		}	
	}
}
