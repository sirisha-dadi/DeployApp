package com.ecommerce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerClass {
	
	 @GetMapping(path = "/index")
	  public String helloWorld() {
		  
		  return "index";
	  }

}
