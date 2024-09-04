package com.postpre;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class cricket implements coach{
	public cricket() {
		 System.out.println("In constructor: " + getClass().getSimpleName());
	}
	 @PostConstruct
	    public void doMyStartupStuff() {
	        System.out.println("In postconstruct(): " + getClass().getSimpleName());
	    }
	    @PreDestroy
	    public void doMyCleanupStuff() {
	        System.out.println("In predestroy(): " + getClass().getSimpleName());
	    }

	@Override
	public String training() {
		return "Take continous practice!";
	}

}
