package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Goods;
import com.model.Seeds;
import com.service.SeedsService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SeedsController 
{
	@Autowired
	SeedsService seedService;
	
	@PostMapping("/addseeds")
	public Seeds addSeeds(@RequestBody Seeds s) 
	{
		seedService.saveSeeds(s);
		return s;
	}
	
	@GetMapping("/getAllSeeds")
	public List<Seeds> findAllSeeds() {
		return seedService.getAllSeeds();
	}
	
	@PostMapping("addallseeds")
	public List<Seeds> saveAll(@RequestBody List<Seeds> list) 
	{
		
		return seedService.saveAll(list);
	}
	
	@GetMapping("/getSeed/{seedsId}")
	public Seeds getOneSeed(@PathVariable int seedsId) 
	{
		
		return seedService.getOneSeed(seedsId);
	}

	@DeleteMapping("/deleteSeed/{seedsId}")
	public void deleteById(@PathVariable int seedsId)
	{
		seedService.deleteById(seedsId);
	}
	
	@PutMapping("updateSeed")
	public Seeds updateSeed(@RequestBody Seeds s) 
	{
		return seedService.updateSeed(s);
	}
}
