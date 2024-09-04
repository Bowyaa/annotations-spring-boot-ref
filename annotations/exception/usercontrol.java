package com.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
	    @ExceptionHandler
	    public ResponseEntity<UserErrorResponse> handleException(UserNotFoundException exc) {

	        UserErrorResponse error = new UserErrorResponse();

	        error.setStatus(HttpStatus.NOT_FOUND.value());
	        error.setMessage(exc.getMessage());
	        error.setTimeStamp(System.currentTimeMillis());

	        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	    }
	    @ExceptionHandler
	    public ResponseEntity<UserErrorResponse> handleException(Exception exc) {
	    	UserErrorResponse error = new UserErrorResponse();

	        error.setStatus(HttpStatus.BAD_REQUEST.value());
	        error.setMessage(exc.getMessage());
	        error.setTimeStamp(System.currentTimeMillis());
	        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	    }
}
