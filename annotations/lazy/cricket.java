package com.lazy;

import org.springframework.stereotype.Component;

@Component
public class cricket implements coach{
	public cricket() {
		 System.out.println("In constructor: " + getClass().getSimpleName());
	}

	@Override
	public String training() {
		// TODO Auto-generated method stub
		return "Take continous practice!";
	}

}
