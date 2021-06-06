package com.capgemini.dailyassignments.day1;
/*
 * 
 * 5.Write a Java program to generate and show all Kaprekar numbers less than 1000. 
 * Expected Output :
 * 1       1         0 + 1                                  
 * 9       81        8 + 1                                  
 * 45      2025      20 + 25                                
 * 55      3025      30 + 25                                
 * 99      9801      98 + 01                                
 * 297     88209     88 + 209                               
 * 703     494209    494 + 209                              
 * 999     998001    998 + 001                              
 * 8 Kaprekar numbers
 * 
 */

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sq = 0, temp = 0, digCount = 0, p1 = 0, p2 = 0,sum = 0, c=0;
		
		System.out.println("1 1 0+1");
	    for(int i=2;i<1000;i++) {

	    	sq = i * i;
	    	
			temp =sq;
		    while(temp!=0) {
		         digCount++;
		         temp /= 10; 
		    }
		    
		    for(int j=digCount-1; j>0; j--) {
		    	
		         p1 = sq / (int)Math.pow(10, j);
		         p2 = sq % (int)Math.pow(10, j);
		         
		         if(p1 == 0 || p2 == 0)
		         	continue;
		         sum = p1 + p2;
		         
		         if( sum == i ) {
		        	 System.out.println(i +" " +sq +" "+ p1 +"+" + p2);
		        	 c++;
		         	 break;
		         }
		           
		      }
	    	
	    }
	    System.out.println(c+1 + " Kaprekar numbers");
	    
		
	}

}
