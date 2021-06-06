/*
 * 
 * Write a java program that simulates a traffic light. 
 * The program lets the user select one of three lights: red, yellow, or green with radio buttons. 
 * On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .
 * Initially there is no message shown.
 * 
 */
package com.capgemini.lab1allexercise;
import java.util.Scanner;
public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your choice ");
		System.out.println("1 for Red");
		System.out.println("2 for Yellow");
		System.out.println("3 for Green");
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		switch(num) {
		case 1: 
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid Input");
		
		}
		sc.close();
	}

}