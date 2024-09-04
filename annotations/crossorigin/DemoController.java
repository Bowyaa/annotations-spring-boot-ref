package com.crossorigin;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {
	@CrossOrigin(origins="*")
	@GetMapping("/co")
	public String msg()
	{
		return "hiii!";
		}
}
