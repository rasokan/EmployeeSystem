package com.db.codecontest.CoreLogic;

import com.db.codecontest.DomainModel.Employee;

public interface EmployeeManagerService {
	
	public Boolean addNewEmployee(Employee employee);
	
	public Employee searchEmployee(Employee employee);

}
