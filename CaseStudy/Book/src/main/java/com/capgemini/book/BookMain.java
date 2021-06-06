/**
 * 
 */
package com.capgemini.book;

import java.util.Scanner;

import com.capgemini.book.exceptions.ArrayListNullException;
import com.capgemini.book.exceptions.BookNotFoundException;
import com.capgemini.book.service.BookManager;

/**
 * @author DIBYENDU
 *
 */
public class BookMain {

	/**
	 * @param args
	 * @throws BookNotFoundException 
	 * @throws ArrayListNullException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BookManager bm = new BookManager();
		//bm.validateBook(1, null, 10);
		char choice = 'y',ch;
		do {
			System.out.println("Enter your choice:\n"
					  +"C to Create\n"
					  +"R to Read\n"
					  +"U to Update\n"
					  +"A to Display All\n"
					  +"D to Delete");
			ch = sc.nextLine().charAt(0);
			switch(ch) {
			case 'C':
				int id = bm.readId();
				String name = bm.readName();
				int price = bm.readPrice();
				
				bm.addBook(id, name, price);;
				break;
			case 'R':
				int idRead = bm.readId();
				try {
					bm.displayBookById(idRead);
				} catch (ArrayListNullException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
					//e.printStackTrace();
				} catch (BookNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
					//e.printStackTrace();
				}
				break;
			case 'U':
				int idUpdate = bm.readId();
				price=0;
				name = "";
				try {
					System.out.print("Want to Update name? Yes or No: ");
					String nameUpdate=sc.nextLine();
					System.out.print("Want to Update price? Yes or No: ");
					String priceUpdate=sc.nextLine();
					if(nameUpdate.equalsIgnoreCase("yes")) {
						name = bm.readName();
					}
					if(priceUpdate.equalsIgnoreCase("yes")) {
						price = bm.readPrice();	
					}
					bm.updateBookById(idUpdate,name,nameUpdate,price,priceUpdate);
				} catch (ArrayListNullException e) {
					
					// TODO Auto-generated catch block
					System.out.println(e);
					//e.printStackTrace();
				} catch (BookNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
					//e.printStackTrace();
				}
				break;
			case 'A':
				try {
					bm.displayAllBooks();
				} catch (ArrayListNullException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
					//e.printStackTrace();
				}
				break;
			case 'D':
				int idDel = bm.readId();
				try {
					bm.delBookById(idDel);
				} catch (ArrayListNullException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
					//e.printStackTrace();
				} catch (BookNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
					//e.printStackTrace();
				}
				break;
			default:
				System.out.println("Please enter a valid option");
				break;
			}
			System.out.println("Press 'y' to continue");
			choice = sc.nextLine().charAt(0);
		}while(choice=='y');
				
		System.out.println("---Operations ended---");
		sc.close();
	}

}
