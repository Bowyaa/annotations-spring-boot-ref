package com.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public class async { 
    @Async
    void as()
    {
    	System.out.println("Thread working: "+Thread.currentThread().getName());
    }
}
