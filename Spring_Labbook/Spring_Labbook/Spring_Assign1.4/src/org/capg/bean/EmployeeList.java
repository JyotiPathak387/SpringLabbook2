package org.capg.bean;

import java.util.List;

public class EmployeeList {

	private List<Employee> emplist;


	public List<Employee> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

	public EmployeeList(List<Employee> emplist) {
		super();
		this.emplist = emplist;
	}
}
