/**
 * 
 */
package com.capgemini.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author DIBYENDU
 *
 */
public class CopyDataThread extends Thread implements Runnable {

	FileInputStream fileInput;
	FileOutputStream fileOutput;
	
	public CopyDataThread(FileInputStream fileInput, FileOutputStream fileOutput) {
		
		super();
		this.fileInput = fileInput;
		this.fileOutput = fileOutput;
	}
	
	@Override
	public void run() {
		
		int inputLength = 0;
		int characterCount = 0;
		
		try {
            while (!((inputLength = fileInput.read()) < 0)) {
                char character = (char) inputLength;
                fileOutput.write(character);
                characterCount += 1;
                if (characterCount == 10) {
                    System.out.println("10 characters are copied");
                    System.out.println();
                    characterCount = 0;
                    Thread.sleep(5000);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
	}
}
