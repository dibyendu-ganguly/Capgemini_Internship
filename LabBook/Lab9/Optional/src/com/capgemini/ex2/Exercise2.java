/**
 * 
 */
package com.capgemini.ex2;

import java.util.Scanner;

/**
 * @author DIBYENDU
 *
 */

public class Exercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringFormatter sf = (s) -> {
			String res = "";
			for(int i=0;i<s.length();i++)
				res = res + s.charAt(i) + " ";
			System.out.println(res.strip());
		};
		System.out.println("Enter the string: ");
		String st = sc.nextLine();
		sf.formatString(st);
		sc.close();
	}

}
