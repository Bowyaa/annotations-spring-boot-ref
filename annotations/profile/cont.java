package com.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class cont {
	@Autowired 
	private Environment env;
	@GetMapping("/prof")
	public String[] ms()
	{
		String[] profile=env.getActiveProfiles();
		return profile;
		
	}
}
