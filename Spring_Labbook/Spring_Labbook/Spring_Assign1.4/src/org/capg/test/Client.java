package org.capg.test;

import java.util.Scanner;

import org.capg.bean.Employee;
import org.capg.bean.EmployeeList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID : ");
		int id=sc.nextInt();
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("org/capg/cfg/SpringConfig.xml");
		EmployeeList e=(EmployeeList) context.getBean("emp");
		System.out.println("-------Employee Details----");
		for(int i=0;i<e.getEmplist().size();i++)
		{
			if(e.getEmplist().get(i).getEmployeeId() == id)
			{
				e.getEmplist().get(i).display();
			}
		}
		
		}

}
