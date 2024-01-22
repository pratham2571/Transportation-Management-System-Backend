package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.dao.FarmerRepository;
import com.model.Farmer;

@Service 
public class FarmerServiceImpl implements FarmerService
{
	@Autowired
	FarmerRepository farRepo;
	
	public Farmer saveFarmer(Farmer f)
	{
		farRepo.save(f);
		return f;
	}
	
	public List<Farmer> saveAll(@RequestBody List<Farmer> flist) 
	{
		return farRepo.saveAll(flist);
	}
	
	public Farmer getOneFarmer(int farmerId) 
	{
		
		return farRepo.findById(farmerId).orElse(null);
	}
	
	public List<Farmer> getAllFarmer() {
		return farRepo.findAll();
	}
	
	public void deleteById(int fId)
	{
		farRepo.deleteById(fId);
	}
	
	public Farmer updateFarmer(Farmer f) 
	{
		Farmer existFarmer=farRepo.findById(f.getFarmerId()).orElse(null);
		existFarmer.setFarmerName(f.getFarmerName());;
		return farRepo.save(existFarmer);
	}
	
	public Farmer getFarmerByEmail(String email) {

		return farRepo.findFarmerByEmail(email);
	}
	
	public Farmer findByEmailIdAndPassword(String email, String password) {

		return farRepo.findByEmailIdAndPassword(email, password);
	}
}
