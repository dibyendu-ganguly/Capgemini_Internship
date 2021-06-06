/**
 * 
 */
package com.capgemini.service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author DIBYENDU
 *
 */
public class GetValuesManager {
	HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap 
	List<String> list=new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	int nextkey=0; //Variable to auto generate key 
	/**
	 * 
	 * @param value -> String value
	 */
	public void addItemToMap(String value) {
		map.put(++nextkey, value); //Auto generating key
		list.add(value);
	}
	/**
	 * method to read value as user input
	 * @return val -> the read value
	 */
	public String readValue() {
		String val = sc.nextLine();
		return val;
	}
	/**
	 * method to get the HashMap
	 * @return map -> HashMap object 'map'
	 */
	public HashMap<Integer,String> getMap(){
		return map;
	}
	
	
//	/**
//	 * method to return a list with values of HashMap in sorted order
//	 * @param map -> HashMap
//	 * @return sortedList -> list with hashMap values in sorted order
//	 */
//	public List<String> sort(List<String> l) {
//		List<String> sortedList = l.stream().sorted().collect(Collectors.toList());
//		return sortedList;
//	}
	/**
	 * method to iterate over a list and display the values
	 * @param l -> list of string where items are HashMap values
	 */
	public void displaySortedValues(List<String> l) {
		for(String v:l) {
			System.out.println(v);
		}
	}
	/**
	 * 
	 * @param map get the HashMap
	 * @return the sortedList 
	 */
	 public List<String> getValues(HashMap<Integer,String> map) {
		List<String> listVal=new ArrayList<String>();
		for (Map.Entry<Integer,String> mapElement : map.entrySet()) {
            String val = (String)mapElement.getValue();
            listVal.add(val);
        }
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		return sortedList;
		 
	 }
	 
	

}
