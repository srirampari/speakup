package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginctrl {

	
	
	@RequestMapping("/")
	public String logincontroller() {
		return "hello";
	}
	
	
}
