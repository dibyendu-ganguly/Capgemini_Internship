package com.capgemini.dailyassignments.day2;
/*
 * Write a Java program to remove an element by taking an index from the user.
 */

import java.util.Scanner;
public class RemoveElementByIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int i;
		int[] array = new int[n];
		System.out.println("Enter the " + n +" number of elements of the arrray: ");
        for(i=0;i<n;i++){
            array[i]=sc.nextInt();   
        }
        System.out.print("Enter the index from which the data is to be removed: ");
        int index = sc.nextInt();
        if(index<0 || index>=n) {
        	System.out.println("Wrong index. Specified index is out of range.");
        	System.exit(0);
        }
        int[] resArray = new int[n-1];
        
        for(i=0;i<n-1;i++){
        	if(i<index)
        		resArray[i]=array[i];
        	else
        		resArray[i]=array[i+1];
        }
        System.out.println("The array after removing the element from index "+index+" : ");
        for(i=0;i<n-1;i++){
            System.out.print(resArray[i] + " ");  	
        }
        
        sc.close();
		

	}

}
