package com.capgemini.dailyassignments.day1;
/*
 * 
 * 7.Write a Java program to display first 10 lucus numbers.
The Lucas numbers or series are an integer sequence named after 
the mathematician François Édouard Anatole Lucas, 
who studied both that sequence and the closely related Fibonacci numbers. 
Lucas numbers and Fibonacci numbers form complementary instances of Lucas sequences.
The sequence of Lucas numbers is: 2, 1, 3, 4, 7, 11, 18, 29, ….
Expected Output :

   First ten Lucas a numbers:                                              
2                                                                       
1                                                                       
3                                                                       
4                                                                       
7                                                                       
11                                                                      
18                                                                      
29                                                                      
47                                                                      
76
 * 
 */
public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n1=2,n2=1,n3,i;  
		 System.out.println("First ten Lucas numbers:");
		 System.out.print(n1+"\n"+n2+"\n");//printing 0 and 1    
		    
		 for(i=2;i<10;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.println(n3);    
		  n1=n2;    
		  n2=n3;    
		 } 

	}

}
