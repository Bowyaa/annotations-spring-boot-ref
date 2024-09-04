package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class config {
	@Bean("bean1")
    @DependsOn({"bean2", "bean3"})
    public Bean1 bean1() {
        return new Bean1();
    }

    @Bean("bean2")
    public Bean2 bean2() {
        return new Bean2();
    }

    @Bean("bean3")
    public Bean3 bean3() {
        return new Bean3();
    }
}
