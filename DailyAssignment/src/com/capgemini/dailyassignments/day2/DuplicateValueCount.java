package com.capgemini.dailyassignments.day2;
/*
 * Write  a Java Program to count number of duplicated values in
 * a) integer array
 * b) char array (create the char array in lower case)
 * 
 */

import java.util.Scanner;
public class DuplicateValueCount {
	
	public int findElementCountInt(int arr[], int size, int ele){
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]==ele){
                count++;
            }
        }
        return count;
    }
	public int findElementCountChar(char arr[], int size, char ele){
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]==ele){
                count++;
            }
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DuplicateValueCount eC = new DuplicateValueCount();
		
		
		System.out.print("Enter the number of the elements in the integer array: ");
		int n = sc.nextInt();
		if(n<0){
            System.out.print("Invalid Input");
            System.exit(0);
        }
		int[] intArray = new int[n];
		for(int i=0;i<n;i++) {
			intArray[i]=sc.nextInt();
		}
		int intFlag = 0,intRepeat=0;
		for(int i=0;i<n;i++) {
			if(eC.findElementCountInt(intArray,n,i)>1) {
				intFlag=1;
				System.out.println("Element "+i+" is repeated "+eC.findElementCountInt(intArray,n,i)+" times");
				intRepeat++;
			}
		}
		System.out.println("Total number of repeating integers: "+intRepeat);
		if(intFlag==0) {
			System.out.println("No element is repeated");
		}
		
		
		

		System.out.print("Enter the number of the elements in the character array: ");
		int l = sc.nextInt();
		if(l<0){
            System.out.print("Invalid Input");
            System.exit(0);
        }
		
		char[] charArray = new char[l];
		int[] charVisit = new int[l];
		for(int i=0;i<l;i++) {
			charArray[i]=sc.next().charAt(0);
			charVisit[i]=0;
		}
		String str = String.valueOf(charArray);
		int charFlag=0,charRepeat=0;
		for(int i=0;i<l;i++) {
			if((eC.findElementCountChar(charArray,l,charArray[i])>1) && charVisit[str.indexOf(charArray[i])] == 0) {
				charFlag=1;
				System.out.println("Element "+charArray[i]+" is repeated "+eC.findElementCountChar(charArray,l,charArray[i])+" times");
				charRepeat++;
				charVisit[i]=1;
			}
		}
		
		System.out.println("Total number of repeating characters: "+charRepeat);
		if(charFlag==0) {
			System.out.println("No element is repeated");
		}
		
		
		sc.close();
	}

}
