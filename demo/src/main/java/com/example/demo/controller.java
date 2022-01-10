package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class controller {
   
    @GetMapping("/dark")
    public String Dark(){
        return("divdark");
    }

    @GetMapping("/dim")
    public String Dim(){
        return("divdim");
    }

    @GetMapping("/red")
    public String Red(){
        return("divred");
    }
    @GetMapping("/light")
    public String Light(){
        return("divlight");
    }
    @GetMapping("/night")
    public String Night(){
        return("divnight");
    }
    
    



    
}
