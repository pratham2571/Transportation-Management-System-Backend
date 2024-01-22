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
import com.service.FarmerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FarmerController 
{
	@Autowired
	FarmerService farService;
	
	@PostMapping("/addfarmer")
	public Farmer addFarmer(@RequestBody Farmer farmer) throws Exception
	{
	
		String tempEmail =farmer.getFemailId();
		if(tempEmail !=null && !"".equals(tempEmail)) {
			Farmer farObj=farService.getFarmerByEmail(tempEmail);
			if(farObj!=null) {
				throw new Exception("Farmer with "+tempEmail+" is already exit");
			}
		}
		Farmer farObj1=null;
		farObj1=farService.saveFarmer(farmer);
		return farObj1;
	}
	
	@PostMapping("/loginFarmer")
	public Farmer loginFarmer(@RequestBody Farmer farmer) throws Exception {
		String tempEmail=farmer.getFemailId();
		String tempPass=farmer.getFarmerPassword();
		Farmer farObj=null;
		if(tempEmail !=null && tempPass!=null) {
			farObj=farService.findByEmailIdAndPassword(tempEmail, tempPass);
		}
		if(farObj==null) {
			throw new Exception("Bad Creadentials");
		}
		return farObj;
		
	}	
	
	@PostMapping("addallfarmers")
	public List<Farmer> saveAll(@RequestBody List<Farmer> list) 
	{
		
		return farService.saveAll(list);
	}
	
	@GetMapping("/getFarmer/{farmerId}")
	public Farmer getOneFarmer(@PathVariable int farmerId) 
	{
		
		return farService.getOneFarmer(farmerId);
	}
	
	@GetMapping("/getAllFarmer")
	public List<Farmer> findAllFarmer() {
		return farService.getAllFarmer();
	}
	
	@DeleteMapping("/deleteFarmer/{farmerId}")
	public void deleteById(@PathVariable int farmerId)
	{
		farService.deleteById(farmerId);
	}
	
	@PutMapping("updateFarmer")
	public Farmer updateFarmer(@RequestBody Farmer f) 
	{
		return farService.updateFarmer(f);
	}
	
}

