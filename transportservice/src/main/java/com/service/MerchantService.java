package com.service;

import java.util.List;

import com.model.Farmer;
import com.model.Merchant;

public interface MerchantService 
{
	public Merchant saveMerchant(Merchant m);
    public List<Merchant> saveAll(List<Merchant> mlist);
	
	public Merchant getOneMerchant(int merchantId);
	
	public List<Merchant> getAllMerchant();
		
	public void deleteById(int mId);
	
	public Merchant updateMerchant(Merchant m);
	public Merchant getMerchantByEmail(String tempEmail);

	public Merchant findByEmailIdAndPassword(String tempEmail, String tempPass);
	
}

