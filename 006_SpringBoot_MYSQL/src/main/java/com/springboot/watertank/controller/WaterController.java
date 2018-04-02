package com.springboot.watertank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.watertank.entity.UseWater;
import com.springboot.watertank.repository.WaterRepository;


@RestController
@RequestMapping("/water")
public class WaterController {
	
	@Autowired
	private WaterRepository waterRepository;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to FREE Water at CTS!!!";
	}
	
	@RequestMapping("/welcome/free")
	public String welcomefree() {
		return "You win 1 ltr of free cocktail!!!";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addWater(@RequestBody UseWater usewater) {
		
		waterRepository.save(usewater);
		return "Saved the water in water tank: " + usewater.getQuantity() + " " + usewater.getContainer();
		
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String deleteWater(@PathVariable Integer id) {
		
		waterRepository.deleteById(id);
		return "Emptied water in water tank";
		
	}
	
	
	
	
	

}
