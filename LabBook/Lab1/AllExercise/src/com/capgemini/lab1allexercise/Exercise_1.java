/*
 * Create a method to find the sum of the cubes of the digits of an n digit number
 */
package com.capgemini.lab1allexercise;
import java.util.Scanner;
public class Exercise_1 {
	
	static int sumOfCubesOfDigits(int num)  {
		int temp=num,sum=0,r;
		while(temp!=0) {
			r = temp%10;
			sum = sum + (r*r*r);
			temp=temp/10;
		}
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find the sum of the cube of it's digits:");
		int n = sc.nextInt();
		int result = sumOfCubesOfDigits(n); 
        System.out.printf ("Required sum of the cube of the digits of the number "+ n +" : "+ result);
		sc.close();

	}

}
