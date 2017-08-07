package com.uk.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("userController1")
//@ComponentScan(basePackages="com.uk.di")
public class UserController {

	@Autowired
	private PrintServiceImpl printServiceImpl;

	public void userData() {
		printServiceImpl.printValues();
	}

}
