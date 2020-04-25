package org.capg.test;


import org.capg.bean.Employee;
import org.capg.bean.SBU;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


ApplicationContext context= new ClassPathXmlApplicationContext("org/capg/cfg/SpringConfig.xml");

SBU sb=( SBU)context.getBean("sbu");
System.out.println(sb);

	}	
		
	}


