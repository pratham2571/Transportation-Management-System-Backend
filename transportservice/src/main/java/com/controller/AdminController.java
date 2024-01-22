package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Admin;
import com.service.AdminService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminController 
{
	@Autowired
	AdminService admService;
	
	@PostMapping("/addadmin")
	public Admin addAdmin(@RequestBody Admin a) 
	{
		admService.saveAdmin(a);
		return a;
	}
	
	@GetMapping("/getAdmin/{id}")
	public Admin getOneAdmin(@PathVariable int id) 
	{
		
		return admService.getOneAdmin(id);
	}
	
	@GetMapping("deleteAdmin/{adminId}")
	public void deleteById(@PathVariable int id)
	{
		admService.deleteById(id);
	}
	
	@PutMapping("updateAdmin")
	public Admin updateAdmin(@RequestBody Admin a) 
	{
		return admService.updateAdmin(a);
	}
}

