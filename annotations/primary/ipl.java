package com.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ipl implements coach{
	@Override
	public String training() {
		return "T20 gonna start soon!";
	}

}
