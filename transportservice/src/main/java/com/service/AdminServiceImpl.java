package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminRepository;
import com.model.Admin;

@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
	AdminRepository admRepo;
	
	public Admin saveAdmin(Admin a)
	{
		admRepo.save(a);
		return a;
	}
	
	
	public Admin getOneAdmin(int adminId) 
	{
		
		return admRepo.findById(adminId).orElse(null);
	}
		
	public void deleteById(int adminId)
	{
		admRepo.deleteById(adminId);
	}
	
	public Admin updateAdmin(Admin a) 
	{
		Admin existAdmin=admRepo.findById(a.getAdminId()).orElse(null);
		existAdmin.setAdminName(a.getAdminName());;
		return admRepo.save(existAdmin);
	}


	
}
