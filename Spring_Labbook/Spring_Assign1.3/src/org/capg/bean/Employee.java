package org.capg.bean;


public class Employee {

	private int age;
	private int employeeId;
	private String employeeName;
	private double salary;
	
	public Employee(int age, int employeeId, String employeeName, double salary) {
		super();
		this.age = age;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [age=" + age + ", employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary="
				+ salary + "]";
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

	public Employee()
	{}
	
	
}
