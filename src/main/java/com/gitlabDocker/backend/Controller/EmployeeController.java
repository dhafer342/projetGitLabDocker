package com.gitlabDocker.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/listEmployee")
    public String listEployee(){
        return "this is the list";
    }


}
