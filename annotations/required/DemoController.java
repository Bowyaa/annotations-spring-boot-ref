package com.required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	private coach mycoach;
	@Autowired(required=false)
	public DemoController(@Qualifier("ipl")coach thecoach)
	{
		this.mycoach=thecoach;
	}
	@GetMapping("/req")
	public String training()
	{
		return mycoach.training();
		}
}
