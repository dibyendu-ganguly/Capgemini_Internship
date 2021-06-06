/*
 * Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer.
 */
package com.capgemini.lab1allexercise;
import java.util.Scanner;
public class Exercise_4 {
	
	static boolean isPrime(int n){
        if (n <= 1){
            //System.out.printf("%d not prime\n",n);
            return false;
        }
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0){
                //System.out.printf("%d not prime",n);
                return false;
            }
        //System.out.printf("%d prime",n);
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer to print all the prime numbers up to that integer: ");
		int num = sc.nextInt();
		System.out.println("\nPrime numbers up to " + num + " :");
		for(int i=1;i<=num;i++) {
			if(isPrime(i)){
                System.out.println(i + " is a prime number.");
            }
		}
		sc.close();

	}

}