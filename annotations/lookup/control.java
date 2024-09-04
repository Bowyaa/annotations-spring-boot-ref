package com.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {
	
	@Autowired
	scopesclass s;
	@GetMapping("/chk")
	public String chkscope()
	{
		System.out.println(chktyp());
		return "checked";
	}
	
	@Lookup
	public scopesclass chktyp()
	{
		return null;
	}
	
}
