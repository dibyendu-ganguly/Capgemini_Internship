/**
 * How to find the maximum  occurring character in a given string
 */
package com.capgemini.dailyassignments.day6;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class MaxOccuringCharInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();

		int count[] = new int[256];
		for(int i=0;i<str.length();i++) {
	            count[str.charAt(i)]++;
		}   
      
       
        int max = Arrays.stream(count).max().getAsInt();
        //String s;
        System.out.println("The most occured character(s) is/are: ");
        for (int i = 0; i < 256; i++) {
            if (max == count[i]) {
                System.out.println((char)i);
            }
        }
		
		
		sc.close();

	}

}
