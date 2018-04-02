package com.springboot.mysql.work;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/water")
public class WaterController {
	
	
	@Autowired
	private WaterRepository waterRepository;

	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to free water ";
	}

	@RequestMapping("/welcome/free")
	public String welcomefree() {
		return "you win 1ltr of cocktail!!!";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addWater(@RequestBody UseWater usewater) {
		waterRepository.save(usewater);
		return "Saved the water in water tank: " + usewater.getQuantity() + " " + usewater.getContainer();
	}
}
