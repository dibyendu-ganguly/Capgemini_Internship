/**
 * 
 */
package com.capgemini.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author DIBYENDU
 *
 */
public class VoterListManager {
	Scanner sc = new Scanner(System.in);
	HashMap<String,Integer> map = new HashMap<String,Integer>();
	List<String> list = new ArrayList<String>();
	/**
	 * method to add a voter entry set to voter list HashMap
	 * @return
	 */
	public HashMap<String,Integer> createVoterList() {
		String id;
		int age;
		System.out.println("Enter the Id: ");
		id = sc.nextLine();
		do {
			try {
				System.out.println("Enter the age of the person: ");
				age = sc.nextInt();
				sc.nextLine();
			}catch(InputMismatchException e) {
				System.out.println(e + " : Age should not consists of anything other than digits");
				sc.nextLine();
				continue;
			}
			break;
		}while(true);
		map.put(id, age);
		return map;
	}
	/**
	 * Generate the list of voters based on the ages of the people 
	 * @param map
	 * @return list of id who are eligible for voting
	 */
	public List<String> voterList(HashMap<String,Integer> map){
		if(map == null)
			throw new RuntimeException("Voters List map is null");
		boolean empty = true;
		for (Object ob : map.entrySet()) {
		  if (ob != null) {
		    empty = false;
		    break;
		  }
		}
		if(empty==true)
			throw new RuntimeException("Voter List map is null");
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			if(m.getValue()>18 && !list.contains(m.getKey()))
				list.add(m.getKey());
			if(m.getValue()<=18)
				list.remove(m.getKey());
		}
		return list;
	}
}
