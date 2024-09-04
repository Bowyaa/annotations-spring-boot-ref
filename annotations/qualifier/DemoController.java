package com.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	private coach mycoach;
	@Autowired
	public DemoController(@Qualifier("ipl")coach thecoach)
	{
		mycoach=thecoach;
	}
	@GetMapping("/quali")
	public String training()
	{
		return mycoach.training();
		}
}
