package com.example.HelloWorldThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldThymeleafController {

	 @GetMapping("/")
	 public String hello()
	 {
	        return "hello";
	 }

}
