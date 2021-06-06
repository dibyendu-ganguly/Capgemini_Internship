package com.capgemini.dailyassignments.day2;
/*
 * Write a Java program to merge two unsorted arrays of differnt lengths.
 */
import java.util.Scanner;
public class MergeTwoUnsortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("Enter the number of elements of array one: ");
        int n1 = sc.nextInt();
        
        int[] array1 = new int[n1];
        System.out.println("Enter the " + n1 +" number of elements of arrray one: ");
        for(i=0;i<n1;i++){
            array1[i]=sc.nextInt();   
        }
        
        System.out.print("Enter the number of elements of array two: ");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter the "+ n2 +" elements of arrray two: ");
        for(i=0;i<n2;i++){
            array2[i]=sc.nextInt();   
        }
        
        sc.close();
        int[] array3 = new int[n1+n2];
        for(i=0;i<n1;i++){
        	array3[i]=array1[i];
        }
        for(i=n1;i<n1+n2;i++) {
        	array3[i]=array2[i-n1];
        }
        System.out.println("The merged array after merging the two unsorted arrays:");
        for(i=0;i<n1+n2;i++) {
        	System.out.print(array3[i]+" ");
        }
        
        
        

	}

}
