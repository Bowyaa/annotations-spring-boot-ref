package com.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableCaching
public class controller {
	@GetMapping("/cache")
	@Cacheable("info")
	public String chkcache()
	{
		System.out.println("INFO BEING CACHED");
		return "Good day!";
	}
}
