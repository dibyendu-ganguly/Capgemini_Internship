/**
 * 
 */
package com.capgemini.main;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.capgemini.ex1.CopyDataThread;
/**
 * @author DIBYENDU
 *
 */
public class FileProgram {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File input = new File("C:\\Users\\DIBYENDU\\Documents\\Capgemini\\CapgeminiInternship\\LabBook\\Lab8\\Exercise1\\source.txt");
		File output = new File("C:\\Users\\DIBYENDU\\Documents\\Capgemini\\CapgeminiInternship\\LabBook\\Lab8\\Exercise1\\target.txt");
		
		FileInputStream fIn = new FileInputStream(input);
        FileOutputStream fOut = new FileOutputStream(output);
        CopyDataThread cdt = new CopyDataThread(fIn, fOut);
        cdt.run();
	}

}