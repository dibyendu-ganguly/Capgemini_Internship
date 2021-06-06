/**
 * Exercise 5: Write a Java program that displays the number of characters, lines and words in a text.
 */
package com.capgemini.lab3exercise;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class Exercise_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Text: ");
		String str = sc.nextLine();
		str = str.trim();
		int lineNum=0,wordNum=0,charNum=0;
		String[] lines = str.split("\\."); //split against . to find lines >> array of strings 
		
		
		String[] word;
		lineNum=lines.length;
		for(int i=0;i<lineNum;i++) {
			word = lines[i].trim().split(" "); //split each lines against <space> to find words >> array of strings
			
			//Find number of characters in each word
			for(int j=0;j<word.length;j++) {
				charNum += word[j].length();
			}
			wordNum += lines[i].trim().split(" ").length;
		}
			
		System.out.println("The number of lines in the text: "+lineNum);
		System.out.println("The number of words in the text: "+wordNum);
		System.out.println("The number of characters in the text excluding space and period: "+charNum);
		System.out.println("The number of characters in the text including spaces between words and period: "+str.length());
		sc.close();

	}

}
