package com.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contr {
	@Autowired
	async a;
	
	@GetMapping("/async")
	public String msg() {
		System.out.println("Start Thread: "+Thread.currentThread().getName());
        a.as();
        System.out.println("End Thread: "+Thread.currentThread().getName());
        return "Async method called!";
    }
}
