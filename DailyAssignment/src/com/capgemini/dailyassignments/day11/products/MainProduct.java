/**
 * 
 */
package com.capgemini.dailyassignments.day11.products;
/**
 * @author DIBYENDU
 *
 */
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;
//import com.capgemini.dailyassignments.day11.ems.Employee;

//import com.capgemini.dailyassignments.day11.ems.Employee;
public class MainProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Declaring an array of employee
		Product[] pList;
		
		//allocating the memory for 3 employee objects 
		System.out.println("Enter the number of products: ");
		int prodNum = sc.nextInt();
		pList = new Product[prodNum];
		Product prod = new Product();
		int i=0;
		int nextId = 0;
		
		int  ch=1;
		int choice;
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1 for Create");
			System.out.println("2 for Update");
			System.out.println("3 for Delete");
			System.out.println("4 for Display All ");
			System.out.println("5 for Display by Id");
			choice = sc.nextInt();
			switch (choice) {
			  case 1:
				System.out.print("Enter the product name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Enter the product price: ");
				int pr = sc.nextInt();
				pList[i++] = new Product(++nextId, name, pr);
				//System.out.println(nextId);
			    System.out.println("To continue Press 1, else 0");
			    ch=sc.nextInt();
			    if(ch==1)
			    break;
			  case 2:
				if(i==0)
					System.out.println("No product exists!");
				else {
					System.out.println("Enter the product Id for updating the product details:");
				    int idUpdate = sc.nextInt();
				    if(idUpdate>i)
				    	System.out.println("Entered Product Id does not exist");
				    else
				    {
				    	System.out.println("Enter new name: ");
				    	sc.nextLine();
				    	String nameUpdate = sc.nextLine();
				    	pList[idUpdate-1].setpName(nameUpdate);
				    	System.out.print("Enter new price: ");
				    	int priceUpdate = sc.nextInt();
				    	pList[idUpdate-1].setPrice(priceUpdate);
				    }
				}
			    
			    System.out.println("To continue Press 1, else 0");
			    ch=sc.nextInt();
			    if(ch==1)
			    break;
			  case 3:
				  if(i==0)
						System.out.println("No product exists!");
				  else {
						System.out.println("Enter the product Id for deleteing the product details:");
					    int idDelete = sc.nextInt();
					    if(idDelete>nextId)
					    	System.out.println("Entered Product Id does not exist");
					    else
					    {
					    	pList =  ArrayUtils.remove(pList,idDelete-1);
					    	i--;
					    	System.out.println("Deleted product with product id"+idDelete);
					    	
					    }
					}
				
				  System.out.println("To continue Press 1, else 0");
				  ch=sc.nextInt();
				  if(ch==1)
					  break;
			  case 4:
				if(i==0)
					System.out.println("No product exists!");
				else {
					System.out.println("List of all products: ");
				    prod.displayProductDetails(pList,i);
				}
			    System.out.println("To continue Press 1, else 0");
			    ch=sc.nextInt();
			    if(ch==1)
			    break;
			  case 5:
				  if(i==0)
						System.out.println("No product exists!");
					else {
						System.out.println("Enter the product Id: ");
						int prodId = sc.nextInt();
					    prod.displayProduct(pList,prodId,i);
					}
			    System.out.println("To continue Press 1, else 0");
			    ch=sc.nextInt();
			    if(ch==1)
			    break;
			  
			  default:
			    System.out.println("Plese enter a valid option");
			    System.out.println("To continue Press 1, else 0");
			    ch=sc.nextInt();
			    if(ch==1)
			    break;
			}
		}while(ch==1);
		sc.close();
	}

}

