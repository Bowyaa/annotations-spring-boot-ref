package com.path;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
public class usercontrol {
	private List<user> theuser;
	@PostConstruct
	public void add() {

		theuser = new ArrayList<>();

		theuser.add(new user("bowi","rjpm"));
		theuser.add(new user("yuvi","rjpm"));
    }
	@GetMapping("/user")
    public List<user> getStudents() {

        return theuser;
    }
	 @GetMapping("/user/{userid}")
	    public user getStudent(@PathVariable int userid) {
	        return theuser.get(userid);
	    }
}
