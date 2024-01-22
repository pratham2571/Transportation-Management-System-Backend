package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.dao.SeedsRepository;
import com.model.Goods;
import com.model.Seeds;

@Service
public class SeedsServiceImpl implements SeedsService
{
	@Autowired
	SeedsRepository seedRepo;
	
	public Seeds saveSeeds(Seeds s)
	{
		seedRepo.save(s);
		return s;
	}
	
	public List<Seeds> getAllSeeds() {
		return seedRepo.findAll();
	}
	
	public List<Seeds> saveAll(@RequestBody List<Seeds> slist) 
	{
		return seedRepo.saveAll(slist);
	}
	
	public Seeds getOneSeed(int seedsId) 
	{
		
		return seedRepo.findById(seedsId).orElse(null);
	}
	
	public void deleteById(int sId)
	{
		seedRepo.deleteById(sId);
	}
	
	public Seeds updateSeed(Seeds s) 
	{
		Seeds existSeeds=seedRepo.findById(s.getSeedssId()).orElse(null);
		existSeeds.setSdescription(s.getSdescription());;
		return seedRepo.save(existSeeds);
	}
}
