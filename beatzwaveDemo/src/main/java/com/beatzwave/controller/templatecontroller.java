package com.beatzwave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class templatecontroller {
	
	
	@GetMapping("/index")
	public String getindex( ) {
		return "index";
		
	}
	
	
	  
	 
}
