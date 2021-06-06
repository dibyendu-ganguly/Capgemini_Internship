/**
 * 
 */
package com.capgemini.dailyassignments.day7.InheritenceExample;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	static void studentDetails() {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        student.setName(name);
        System.out.print("Enter the address: ");
        String address = sc.nextLine();
        student.setAddress(address);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        student.setYear(year);
        System.out.print("Enter the program: ");
        String program = sc.next();
        student.setProgram(program);
        sc.nextLine();
        System.out.print("Enter the fee: ");
        double fee = sc.nextDouble();
        student.setFee(fee);
        sc.nextLine();
        System.out.println("The details are: ");
        System.out.println(student.toString());
        sc.close();

    }

    static void staffDetails() {
        Scanner sc = new Scanner(System.in);
        Staff staff = new Staff();
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        staff.setName(name);
        System.out.print("Enter the address: ");
        String address = sc.nextLine();
        staff.setAddress(address);
        System.out.print("Enter the school: ");
        String school = sc.nextLine();
        staff.setSchool(school);
        System.out.print("Enter the pay: ");
        double pay = sc.nextDouble();
        staff.setPay(pay);
        System.out.println("The details are: ");
        System.out.println(staff.toString());
        sc.close();

    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice: \n1. Student details\n2. Staff details\n");
        int ch = sc.nextInt();
        if (ch == 1)
            studentDetails();
        else if (ch == 2)
            staffDetails();
        else
            System.out.println("Enter choice correctly!");
        sc.close();

	}

}
