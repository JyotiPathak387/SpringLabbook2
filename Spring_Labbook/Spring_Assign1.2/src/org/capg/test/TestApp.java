package org.capg.test;
import org.capg.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

public static void main(String[] args) {
		
ApplicationContext context= new ClassPathXmlApplicationContext("org/capg/cfg/SpringConfig.xml");

Employee employee=(Employee)context.getBean("emp");

System.out.println(employee);


	}

}
