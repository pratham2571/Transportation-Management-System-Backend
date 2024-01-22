package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.dao.MerchantRepository;
import com.model.Farmer;
import com.model.Merchant;

@Service
public class MerchantServiceImpl implements MerchantService
{
	@Autowired
	MerchantRepository merRepo;
	
	public Merchant saveMerchant(Merchant m)
	{
		merRepo.save(m);
		return m;
	}
	
	public List<Merchant> saveAll(@RequestBody List<Merchant> mlist) 
	{
		return merRepo.saveAll(mlist);
	}
	
	public Merchant getOneMerchant(int merchantId) 
	{
		
		return merRepo.findById(merchantId).orElse(null);
	}
	
	public List<Merchant> getAllMerchant() {
		return merRepo.findAll();
	}
	
	public void deleteById(int mId)
	{
		merRepo.deleteById(mId);
	}
	
	public Merchant updateMerchant(Merchant m) 
	{
		Merchant existMerchant=merRepo.findById(m.getMerchantId()).orElse(null);
		existMerchant.setMerchantName(m.getMerchantName());;
		return merRepo.save(existMerchant);
	}
	
	public Merchant getMerchantByEmail(String email) {

		return merRepo.findMerchantByEmail(email);
	}
	
	public Merchant findByEmailIdAndPassword(String email, String password) {

		return merRepo.findByEmailIdAndPassword(email, password);
	}
}

