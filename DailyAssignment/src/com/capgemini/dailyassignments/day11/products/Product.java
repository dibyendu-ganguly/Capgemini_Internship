/*Write a java program using switch statement to perform CRUD 
(create/update/delete/displayall/displaybyid) operations 
on Product class with pid,pname,price*/

package com.capgemini.dailyassignments.day11.products;

//import com.capgemini.dailyassignments.day11.ems.Employee;

public class Product {
	
	private int pId;
	private String pName;
	private int price;
	//private int nextId=0;
	
	public Product() {
		super();
	}
	public Product(int id, String pName, int price) {
		super();
		this.pId = id;
		this.pName = pName;
		this.price = price;
	}
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void displayProductDetails(Product[] p, int len) {
		System.out.println("Number of products: "+len);
		for(int i=0;i<len;i++) {
			System.out.println("Product Id = " + p[i].getpId() + " Product name = " + p[i].getpName() + " Product Price = " + p[i].getPrice());
			System.out.println();
		}
	}
	
	public void displayProduct(Product[] p, int id, int len) {
		for(int i=0;i<len;i++) {
			if(id==p[i].getpId()) {
			System.out.println("Product Id = " + p[i].getpId() + " Product name = " + p[i].getpName() + " Product Price = " + p[i].getPrice());
			System.out.println();
			return;
			}
		}
		System.out.println("Product with given Id not found !!");
	}

}
