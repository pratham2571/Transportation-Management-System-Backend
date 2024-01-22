package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TransportVehicleRepository;
import com.model.TransportVehicle;

@Service
public class TransportVehicleImpl implements TransportVehicleService
{
	@Autowired
	TransportVehicleRepository vehicleRepo;
	
	public TransportVehicle saveVehicle(TransportVehicle t)
	{
		vehicleRepo.save(t);
		return t;
	}
	
	public List<TransportVehicle> getAllVehicle() {
		return vehicleRepo.findAll();
	}
}
