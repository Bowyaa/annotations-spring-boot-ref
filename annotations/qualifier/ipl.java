package com.qualifier;

import org.springframework.stereotype.Component;

@Component
public class ipl implements coach{
	@Override
	public String training() {
		return "T20 gonna start soon!";
	}

}
