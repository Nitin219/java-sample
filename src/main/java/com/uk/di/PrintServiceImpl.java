package com.uk.di;

import org.springframework.stereotype.Component;

@Component
public class PrintServiceImpl {

	public void printValues() {
		System.out.println("Printing values from service layer....");
	}
}
