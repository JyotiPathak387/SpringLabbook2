package org.capg.bean;

public class Employee {

	private int age;
	private int employeeId;
	private String employeeName;
	private double salary;
	private Sbu businessunit;
	public Employee(int age, int employeeId, String employeeName, double salary, Sbu businessunit) {
		super();
		this.age = age;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessunit = businessunit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Sbu getBusinessunit() {
		return businessunit;
	}
	public void setBusinessunit(Sbu businessunit) {
		this.businessunit = businessunit;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary="
				+ salary + ", businessunit=" + businessunit + "]";
	}
	
	
}
