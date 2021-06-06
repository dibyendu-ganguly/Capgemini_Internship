/**
 * 
 */
package com.capgemini.ex4;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.service.GetStudentsManager;

/**
 * @author DIBYENDU
 *
 */
public class GetStudentsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Double> marksMap = new HashMap<String,Double>();//Creating HashMap 
		HashMap<String, String> medalMap = new HashMap<String,String>();
		Scanner sc = new Scanner(System.in);
		GetStudentsManager cm = new GetStudentsManager();
		int marks;
		char ch = 'y';
		int choice=0;
		do {
			System.out.println("------------"
					+"\nEnter choice"
					+"\n------------"
					+"\n1. To add a Student's marks"
					+"\n2. View HashMap of Students's registration numbers and their marks and medals ");
			try {
				choice = sc.nextInt();
				sc.nextLine();
			}
			catch(InputMismatchException e){
				System.out.println(e+" : Enter only a integer for choice!");
				sc.nextLine();
				//e.printStackTrace();
				continue;
			}
			
			switch(choice) {
			case 1:
				System.out.println("Enter the Registration number of the Student");
				String regNo = sc.nextLine();
				do {
					try {
						System.out.println("Enter the marks of the student:");
						marks = sc.nextInt();
						sc.nextLine();
						if(marks<0 || marks>100)
							throw new RuntimeException("Marks cannot be greater than 100 or less than 0");
					} catch(InputMismatchException e) {
						System.out.println(e + " : Marks consists of digits only");
						sc.nextLine();
						continue;
					} catch (RuntimeException e) {
						System.out.println(e);
						//sc.nextLine();
						continue;
					}
					
					break;
				}while(true);
				marksMap=cm.addStudent(regNo, marks);
				break;
			case 2:
				
				try {
					
					medalMap = cm.getStudents(marksMap);
					System.out.println("The student's marks and medals details:");
					System.out.format("%10s || %10s || %30s","RegNo.","Marks","Medal");
					System.out.println("\n-----------------------------------------------------------");
					for (Map.Entry<String,String> mapElement : medalMap.entrySet()) {
			            System.out.format("%10s || %10s || %30s\n",mapElement.getKey(),marksMap.get(mapElement.getKey()),mapElement.getValue());
			        }
				}catch(RuntimeException e) {
					System.out.println(e);
				}
				
				break;
			default:
				System.out.println("Please enter a valid option");
			}
			System.out.print("\nEnter 'y' to continue:");
			ch = sc.next().charAt(0);
		}while(ch == 'y');
		System.out.println("\n---\nEnd\n---");
		sc.close();
	}
}