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
import com.model.Merchant;
import com.service.MerchantService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MerchantController 
{
	@Autowired
	MerchantService merService;
	
	@PostMapping("/addmerchant")
	public Merchant addMerchant(@RequestBody Merchant merchant) throws Exception
	{
	
		String tempEmail =merchant.getEmailId();
		if(tempEmail !=null && !"".equals(tempEmail)) {
			Merchant merObj=merService.getMerchantByEmail(tempEmail);
			if(merObj!=null) {
				throw new Exception("Merchant with "+tempEmail+" is already exit");
			}
		}
		Merchant merObj1=null;
		merObj1=merService.saveMerchant(merchant);
		return merObj1;
	}
	
	@PostMapping("/loginMerchant")
	public Merchant loginMerchant(@RequestBody Merchant merchant) throws Exception {
		String tempEmail=merchant.getEmailId();
		String tempPass=merchant.getMerchantPassword();
		Merchant merObj=null;
		if(tempEmail !=null && tempPass!=null) {
			merObj=merService.findByEmailIdAndPassword(tempEmail, tempPass);
		}
		if(merObj==null) {
			throw new Exception("Bad Creadentials");
		}
		return merObj;
		
	}
	
	@PostMapping("addallmerchants")
	public List<Merchant> saveAll(@RequestBody List<Merchant> list) 
	{
		
		return merService.saveAll(list);
	}
	
	@GetMapping("/getMerchant/{merchantId}")
	public Merchant getOneMerchant(@PathVariable int merchantId) 
	{
		
		return merService.getOneMerchant(merchantId);
	}
	
	@GetMapping("/getAllMerchants")
	public List<Merchant> findAllMerchant() {
		return merService.getAllMerchant();
	}
	
	@DeleteMapping("deleteMerchant/{merchantId}")
	public void deleteById(@PathVariable int merchantId)
	{
		merService.deleteById(merchantId);
	}
	
	
	
	@PutMapping("updateMerchant")
	public Merchant updateMerchant(@RequestBody Merchant m) 
	{
		return merService.updateMerchant(m);
	}
}
