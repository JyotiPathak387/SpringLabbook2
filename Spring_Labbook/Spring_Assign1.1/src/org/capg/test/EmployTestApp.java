package org.capg.test;

import org.capg.emp.Employ;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new ClassPathXmlApplicationContext("org/capg/cfg/EmployConfig.xml");

Employ emp=context.getBean("e",Employ.class);
System.out.println("Employee details");
System.out.println("==========================");
System.out.println("Employee ID : "+emp.getEmpid());
System.out.println("Employee Name : "+emp.getEmpname());
System.out.println("Employee Salary : "+emp.getEmpsalary());
System.out.println("Employee BU : "+emp.getBusinessunit());
System.out.println("Employee Age : "+emp.getAge());
}

}
