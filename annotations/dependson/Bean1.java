package com;

import org.springframework.beans.factory.annotation.Autowired;

public class Bean1 {
	@Autowired
	Bean2 bean2;
	
	@Autowired
	Bean3 bean3;
	
	public Bean1() {
        System.out.println("FirstBean Initialized via Constructor");
    }

    public void populateBeans() {
        bean2.display();
        bean3.display();
    }
}
