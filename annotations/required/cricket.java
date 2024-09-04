package com.required;

import org.springframework.stereotype.Component;

@Component
public class cricket implements coach{
	@Override
	public String training() {
		return "Take training regularly!!";
	}

}
