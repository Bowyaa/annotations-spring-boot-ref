package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	private coach mycoach;
	private coach acoach;
	@Autowired
	public DemoController(@Qualifier("ipl")coach thecoach, @Qualifier ("ipl")coach anothercoach)
	{
		System.out.println("In constructor: "+getClass().getSimpleName());
		mycoach=thecoach;
		anothercoach=mycoach;
	}
	@GetMapping("/bean")
	public String training()
	{
		return mycoach.training();
		}

}
