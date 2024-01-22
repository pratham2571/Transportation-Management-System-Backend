package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.TransportVehicle;
import com.service.TransportVehicleService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class VehicleController 
{
	@Autowired
	TransportVehicleService vehicleService;
	
	@PostMapping("/addvehicle")
	public TransportVehicle addVehicle(@RequestBody TransportVehicle t) 
	{
		vehicleService.saveVehicle(t);
		return t;
	}
	
	@GetMapping("/getAllVehicle")
	public List<TransportVehicle> findAllVehicles() {
		return vehicleService.getAllVehicle();
	}
}

