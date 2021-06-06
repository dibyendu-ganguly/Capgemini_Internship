/**
 * 
 */
package com.capgemini.dailyassignments.day11.flowercollection;



/**
 * @author DIBYENDU
 *
 */
public class Flower {
	private int id;
	private String fname;
	private double pricePerKg;
	private float qty;
	
	
	
	
	public Flower() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Flower(int id, String fname, double pricePerKg, float qty) {
		super();
		this.id = id;
		this.fname = fname;
		this.pricePerKg = pricePerKg;
		this.qty = qty;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public double getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	public float getQty() {
		return qty;
	}
	public void setQty(float qty) {
		this.qty = qty;
	}
	
	
	
}
