package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")

public class controllers {
  public int a= 1000 ;
  @PostMapping("/inc")
  public int Inc(@RequestBody Integer e){
    System.out.println(e);
      return(5);
  } 
 
  @PostMapping("/dec")
  public int Dec(){
      return(a=a-100);
  } 


}
 