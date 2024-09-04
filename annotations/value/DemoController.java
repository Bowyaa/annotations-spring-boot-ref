package com.value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DemoController {
	
	@Value("${team.name}")
    private String teamname;

    @Value("${captain.name}")
    private String captainname;


    @GetMapping("/value")
    public String getTeamInfo() {
        return "team: " + teamname + ", captain name: " + captainname;
    }

}
