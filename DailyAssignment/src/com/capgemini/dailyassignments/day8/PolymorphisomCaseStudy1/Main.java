/**
 * 
 */
package com.capgemini.dailyassignments.day8.PolymorphisomCaseStudy1;

/**
 * @author DIBYENDU
 *
 */
import java.util.*;
public class Main {
	 public static void adminPanel() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter salary: ");
	        int sal = sc.nextInt();
	        Admin a = new Admin(name,sal);
	        
	        a.getName();
	        a.adjustSalary(sal);
	        a.getSalary();
	        a.doAdminStuff();
	        sc.close();
	    }

	    public static void academicPanel() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter salary: ");
	        int sal = sc.nextInt();
	        Academic a = new Academic(name,sal);
	        //System.out.println("Name of academic:");
	        a.getName();
	        a.adjustSalary(sal);
	        a.getSalary();
	        a.giveLecture();
	        sc.close();
	    }


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the choice:\n1. Admin\n2. Academic");
	        int ch = sc.nextInt();
	        if (ch == 1)
	            adminPanel();
	        else if (ch == 2)
	            academicPanel();
	        else
	            System.out.println("Wrong choice!");
	        sc.close();
	    }

}
