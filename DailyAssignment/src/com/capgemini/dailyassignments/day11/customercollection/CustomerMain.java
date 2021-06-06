/**
 * 
 */
package com.capgemini.dailyassignments.day11.customercollection;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



/**
 * @author DIBYENDU
 *
 */
class CustomerMain {

	/**
	 * @param args
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> custList = new ArrayList<Customer>();
		Iterator<Customer> custItr = custList.iterator();
		Customer cust = new Customer();
		int ch = 1,choice;
		int id=0;
		do {
			System.out.println("Enter your choice:\n"
							  +"1 to Add New Customer\n"
							  +"2 to Update Exsisting Customer\n"
							  +"3 to Delete a Customer\n"
							  +"4 to Display All Customer Details\n"
							  +"5 to Display Customer Details by Id");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					
					String name = cust.readName();
					String email = cust.readEmail();
					
					
					System.out.print("Enter the Date of Birth  in YYYY-MM-DD format:");
					//sc.nextLine();
					String dob = sc.next(); 
					LocalDate dateOfBirth = LocalDate.parse(dob);
					LocalDate currDate = LocalDate.now(); 
					Period period = Period.between(dateOfBirth, currDate);
					int age  = period.getYears();
					int day = dateOfBirth.getDayOfMonth();
					Month month = dateOfBirth.getMonth();
					int year = dateOfBirth.getYear();
					while(!cust.validateAge(age)) {
						System.out.print("Enter the Date of Birth in YYYY-MM-DD format:");
						//sc.nextLine();
						dob = sc.next(); 
						dateOfBirth = LocalDate.parse(dob);
						currDate = LocalDate.now(); 
						period = Period.between(currDate, dateOfBirth);
						age  = Math.abs(period.getYears());
						day = dateOfBirth.getDayOfMonth();
						month = dateOfBirth.getMonth();
						year = dateOfBirth.getYear();
					}
					
					String mobile = cust.readMobile();
					
					
					custList.add(new Customer(++id,name,age,day,month,year,email,mobile));
					System.out.println("\nTo continue Press 1, else 0");
					ch=sc.nextInt();
				    if(ch==1)
					break;
				case 2:
					System.out.println("Enter Customer Id to Update customer details");
					int idUpdate = sc.nextInt();
					sc.nextLine();
					
					while(custItr.hasNext()) {
						Customer ct = custItr.next();
						if (ct.getCid()==idUpdate) {
							
							System.out.print("Want to Update name? Yes or No: ");
							String choiceUpdate=sc.nextLine();
							if(choiceUpdate.equalsIgnoreCase("yes")) {
								name = cust.readName();
								ct.setCustname(name);
							}
							System.out.print("Want to Update Email? Yes or No: ");
							choiceUpdate=sc.nextLine();
							if(choiceUpdate.equalsIgnoreCase("yes")) {
								email = cust.readEmail();
								ct.setEmail(email);
							}
							System.out.println("Want to Update Mobile? Yes or No: ");
							choiceUpdate=sc.nextLine();
							if(choiceUpdate.equalsIgnoreCase("yes")) {
								mobile = cust.readMobile();
								ct.setMobile(mobile);
							}
							
						}
					}
					
					System.out.println("\nTo continue Press 1, else 0");
				    ch=sc.nextInt();
				    if(ch==1)
					break;
				case 4:
					System.out.println("--------------------------------\n"
									  +"| The Details of the Customers | \n"
									  +"--------------------------------");
					Iterator<Customer> ctItr = custList.iterator();
					//System.out.println("Id\t||\tName\t||\tDate of Birth\t\t||\tAge\t||\tEmail\t||\tMobile\t");
					System.out.format("|%5s|%30s|%20s|%5s|%20s|%12s|\n","Id","Name","DOB","Age","Email","Mobile");
					System.out.println("===================================================================================================");
					while(ctItr.hasNext()) {
						Customer ct = ctItr.next();
						System.out.format("|%5d|%30s|%20s|%5d|%20s|%12s|\n",ct.getCid(),ct.getCustname(),ct.getDay()+"-"+ct.getMonth()+"-"+ct.getYear()
						,ct.getAge(),ct.getEmail(),ct.getMobile());
						//System.out.println(ct.getCid()+"\t||\t"+ct.getCustname()+"\t||\t"+ct.getDay()+"-"+ct.getMonth()+"-"+ct.getYear()
							//				+"\t||\t"+ct.getAge()+"\t||\t"+ct.getEmail()+"\t||\t"+ct.getMobile());
						System.out.println("--------------------------------------------------------------------");
					}				
					System.out.println("\nTo continue Press 1, else 0");
				    ch=sc.nextInt();
				    if(ch==1)
					break;
				case 3:
					System.out.println("\nTo continue Press 1, else 0");
				    ch=sc.nextInt();
				    if(ch==1)
					break;
				case 5:
					
					System.out.println("\nTo continue Press 1, else 0");
				    ch=sc.nextInt();
				    if(ch==1)
					break;
				default:
					System.out.println("||--Please enter a valid option--||");
					System.out.println("\nTo continue Press 1, else 0");
				    ch=sc.nextInt();
				    if(ch==1)
					break;
			
			}
			
			System.out.println("Enter 1 to continue; any other key to exit");
			
		}while(ch==1);
		
		
		sc.close();
	}

}
