package com.service;

import java.util.List;

import com.model.Farmer;

public interface FarmerService 
{
	public Farmer saveFarmer(Farmer f);
    public List<Farmer> saveAll(List<Farmer> flist);
	
	public Farmer getOneFarmer(int farmerId);
	
	public List<Farmer> getAllFarmer();
		
	public void deleteById(int fId);
	
	public Farmer updateFarmer(Farmer f);
	
	public Farmer getFarmerByEmail(String tempEmail);

	public Farmer findByEmailIdAndPassword(String tempEmail, String tempPass);
	
}

