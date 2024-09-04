package com.trans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cont {
	@Autowired
	serv s;
	@PostMapping("/add")
	public  ResponseEntity<user> saveuser(@RequestBody user users) throws Exception{
        user userSavedToDB = s.adduser(users);
        return new ResponseEntity<user>(userSavedToDB, HttpStatus.CREATED);
    }
}
