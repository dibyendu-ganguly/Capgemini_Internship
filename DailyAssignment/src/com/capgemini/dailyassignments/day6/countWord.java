package com.capgemini.dailyassignments.day6;

import java.util.Scanner;

public class countWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		str = str.trim();
		int lineNum=0,wordNum=0;
		String[] lines = str.split("\\."); //split against . to find lines >> array of strings 
		
		
		lineNum=lines.length;
		for(int i=0;i<lineNum;i++) {
			wordNum += lines[i].trim().split(" ").length;
		}
			
		System.out.println("The number of words in the text: "+wordNum);
		sc.close();

	}

	}
