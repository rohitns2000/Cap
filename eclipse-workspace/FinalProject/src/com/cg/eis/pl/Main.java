package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeMain;

public class Main {

	public static void main(String[] args) {
		EmployeeMain empm = new EmployeeMain();
		
		Employee e = new Employee(100,"Shashank",21000,"Programmer");
		System.out.println(e);
		//String instype = empm.selectInsurance(e);
		
		//System.out.println(instype);
		empm.printStatement(e);
		
		

	}

}
