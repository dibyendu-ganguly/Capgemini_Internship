/**
 * 
 * 
 * Exercise 9: Create a method to accept date 
 * and print the duration in days, months and years with regards to current system date.
 * 
 */
package com.capgemini.lab3exercise;

/**
 * @author DIBYENDU
 *
 */
import java.text.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Exercise_9 {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the date in the format yyyy-MMM-dd: ");
		String strDate = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		formatter = formatter.withLocale( Locale.ENGLISH );  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
		LocalDate date = LocalDate.parse(strDate, formatter);
		LocalDate dateNow = LocalDate.now();
		
		
		Period diff = Period.between( date , dateNow);
		System.out.printf("\nDifference is %d days, %d months and %d years \n\n", 
                 Math.abs(diff.getDays()), Math.abs(diff.getMonths()), Math.abs(diff.getYears()));
		
		sc.close();

	}

}
