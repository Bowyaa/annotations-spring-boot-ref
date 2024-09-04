package com.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class beanconfig {
	@Bean("t20")
    public coach iplcoach() {
        return new ipl();
    }
}
