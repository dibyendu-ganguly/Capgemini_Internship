package com.capgemini.bankATMSystem.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankCustomer {

	private int custId;
	private String custName;
	private String custAddress;
	private String email;
	private static int count = 1000;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId() {
		this.custId = count++;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		
		if(validateMail(email))
			this.email = email;
		else
		{
			System.out.println("Invalid Email");
			this.email = null;
		}
	}
	
	public BankCustomer() {
		super();
	}
	
	public BankCustomer(int custId, String custName, String custAddress, String email) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.email = email;
	}
	
	private static boolean validateMail(String mail)
	{
		String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
                
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(mail);
		
		if(m.matches())
			return true;
		else
			return false;
	}

}
