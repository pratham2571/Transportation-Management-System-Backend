package com.service;

import com.model.Admin;

public interface AdminService 
{
	public Admin saveAdmin(Admin a);
	
	public Admin getOneAdmin(int adminId);
	
	public void deleteById(int adminId);
	
	public Admin updateAdmin(Admin m);
}

