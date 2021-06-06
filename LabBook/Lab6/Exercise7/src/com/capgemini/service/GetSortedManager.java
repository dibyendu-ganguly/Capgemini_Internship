/**
 * 
 */
package com.capgemini.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author DIBYENDU
 *
 */
public class GetSortedManager {
	/**
	 * Return the resulting array after reversing the numbers and sorting it 
	 * Accept and integer array, reverse the numbers in the array, sort it and return the resulting array. 
	 * Hint 
	 * 1. Convert the numbers to String to reverse it 
	 * 2. Use Collection APIs to sort it
	 * @param array int[]
	 * @return int[]
	 */
	public int[] getSorted(int array[]) {
		String[] stringArray = new String[array.length];
		int[] intArray= new int[array.length];
		List<Integer> intList = new ArrayList<Integer>(array.length);
		System.out.println();
		for(int i=0;i<array.length;i++) {
			stringArray[i]=String.valueOf(array[i]);
			//System.out.println(stringArray[i]);
		}
		for(int i=0;i<array.length;i++) {
			 String reverse = new StringBuffer(stringArray[i]).reverse().toString();
			 //System.out.print(reverse+" ");
		     stringArray[i]=reverse;
		     //System.out.print(stringArray[i]+" ");
			 //System.out.println(stringArray[i].getClass());
		}
		
		for(int i=0;i<array.length;i++) {
			intArray[i]=Integer.parseInt(stringArray[i]);
		     //System.out.print(intArray[i]+" ");
		     //System.out.println(((Object)intArray[i]).getClass().getSimpleName());
		}
		
		for (int i : intArray)
		{
		    intList.add(i);
		}
		Collections.sort(intList);
		//Collections.reverse(intList);
		
		final int[] res = new int[intList.size()];
		int index = 0;
		for (final Integer value: intList) {
		   res[index++] = value;
		}
		
		
		return res;
	}
}
