/**
 * 
 */
package com.capgemini.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author DIBYENDU
 *
 */
public class GetStudentsManager {
	Scanner sc = new Scanner(System.in);
	HashMap<String,Double> studentMarks = new HashMap<String,Double>();
	HashMap<String,String> studentMedals = new HashMap<String,String>();
	
	public HashMap<String,Double> addStudent(String regNum, double marks){
		studentMarks.put(regNum, marks);
		return studentMarks;
	}
	public HashMap<String,Double> getStudentMarks(){
		return studentMarks;
		
	}
	/**
	 * Generate the list of students eligible for scholarship
	 * The method should return the details of the students eligible for the medals along with the medal type. 
	 * @param HashMap with Id and Marks
	 * @return HashMap withId and Medals
	 */
	public HashMap<String,String> getStudents(HashMap<String,Double> s){
		if(s==null)
			throw new RuntimeException("Student Marks map is null");
		boolean empty = true;
		for (Object ob : s.entrySet()) {
		  if (ob != null) {
		    empty = false;
		    break;
		  }
		}
		if(empty==true)
			throw new RuntimeException("Student Marks map is null");
		for(Map.Entry<String, Double> m: s.entrySet()) {
			if(m.getValue()>=90)
				studentMedals.put(m.getKey(), "Gold");
			else if(m.getValue()>=80 && m.getValue()<90)
				studentMedals.put(m.getKey(), "Silver");
			else if(m.getValue()>=70 && m.getValue()<80)
				studentMedals.put(m.getKey(), "Bronze");
			else
				studentMedals.put(m.getKey(), "!--Not eligible for medal--!");
		}
		
		return studentMedals;
	}
}
