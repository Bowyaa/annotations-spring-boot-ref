package com.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class cricket implements coach{
	public cricket() {
		 System.out.println("In constructor: " + getClass().getSimpleName());
	}

	@Override
	public String training() {
		return "Take continous practice!";
	}

}
