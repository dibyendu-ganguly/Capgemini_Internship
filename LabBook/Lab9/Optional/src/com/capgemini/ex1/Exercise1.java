/**
 * 
 */
package com.capgemini.ex1;

import java.util.Scanner;

/**
 * @author DIBYENDU
 *
 */

public class Exercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CalPower c = (x,y) -> {
			System.out.println(Math.pow(x, y));
		};
		System.out.println("Enter x:");
		int x = sc.nextInt();
		System.out.println("Enter y:");
		int y = sc.nextInt();
		c.calPow(x, y);
		sc.close();
	};

}
