package com.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ipl implements coach{
	public ipl() {
		 System.out.println("In constructor: " + getClass().getSimpleName());
	}
	@Override
	public String training() {
		return "T20 gonna start soon!";
	}

}
