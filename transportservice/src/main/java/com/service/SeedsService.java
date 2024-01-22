package com.service;

import java.util.List;

import com.model.Goods;
import com.model.Seeds;

public interface SeedsService 
{
	public Seeds saveSeeds(Seeds s);
	public List<Seeds> getAllSeeds();
	
	public List<Seeds> saveAll(List<Seeds> slist);
	public Seeds getOneSeed(int seedsId);		
	public void deleteById(int sId);
	
	public Seeds updateSeed(Seeds s);
}
