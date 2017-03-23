package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/hello")
public class NewController {

	
	@RequestMapping("/say")
	@ResponseBody
	public String hello(){
		
		return "Hello world.";
	}
}
