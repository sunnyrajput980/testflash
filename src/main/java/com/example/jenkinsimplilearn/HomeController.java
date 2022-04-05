package com.example.jenkinsimplilearn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@ResponseBody
	@RequestMapping("/index")
	public String sayHello() {
		return "HELLO WORLD" ;
	}
}
