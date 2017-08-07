package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uk.di.UserController;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
		//ApplicationContext context =
		    	//  new ClassPathXmlApplicationContext(new String[] {"Spring-Module.xml"});
		//ApplicationContext context =
		   // 	   new ClassPathXmlApplicationContext(new String[] {"Spring-Module.xml"});
		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(UserController.class);
		context.refresh();
		 System.out.println("SpringComponentScanAnnotationExample: " +
				 context.getBean("userController"));*/
		 
		UserController cust = (UserController)context.getBean("userController1");
		    	
			cust.userData();

	}
}
