package com.path;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DemoController {

    @GetMapping("/path")
    public String getTeamInfo() {
        return "good morning";
    }

}
