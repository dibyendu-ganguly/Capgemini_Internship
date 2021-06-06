package com.cg.eis.pl;

import com.cg.eis.service.EmployeeServiceClass;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeServiceClass es = new EmployeeServiceClass();
		es.getEmpDetails();
		es.displayEmpDetails();
	}

}
