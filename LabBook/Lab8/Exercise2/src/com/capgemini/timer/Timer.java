/**
 * 
 */
package com.capgemini.timer;

import java.time.LocalTime;

/**
 * @author DIBYENDU
 *
 */
public class Timer extends Thread implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(10000);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
