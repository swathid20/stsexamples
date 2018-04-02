<<<<<<< HEAD
package com.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@RequestMapping("/getsnacks")

	public String welcome()
	{
		return "Hello!!!";
	}
}
=======
package com.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@RequestMapping("/getsnacks")

	public String welcome()
	{
		return "Hello!!!";
	}
}
>>>>>>> 01a185928e1274f8ca09f9c68ba72000a479c780
