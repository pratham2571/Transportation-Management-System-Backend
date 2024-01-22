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

import com.model.Farmer;
import com.model.Goods;
import com.service.GoodsService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class GoodsController 
{
	@Autowired
	GoodsService goodService;
	
	@PostMapping("/addgoods")
	public Goods addGoods(@RequestBody Goods g) 
	{
		goodService.saveGoods(g);
		return g;
	}
	
	@GetMapping("/getAllGoods")
	public List<Goods> findAllGoods() {
		return goodService.getAllGoods();
	}
	
	@PostMapping("addallgoods")
	public List<Goods> saveAll(@RequestBody List<Goods> list) 
	{
		
		return goodService.saveAll(list);
	}
	
	@GetMapping("/getGood/{goodsId}")
	public Goods getOneGood(@PathVariable int goodsId) 
	{
		
		return goodService.getOneGood(goodsId);
	}

	@DeleteMapping("/deleteGood/{goodsId}")
	public void deleteById(@PathVariable int goodsId)
	{
		goodService.deleteById(goodsId);
	}
	
	@PutMapping("updateGood")
	public Goods updateGood(@RequestBody Goods g) 
	{
		return goodService.updateGood(g);
	}
	
}
