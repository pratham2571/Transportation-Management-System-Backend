package com.service;

import java.util.List;

import com.model.TransportVehicle;

public interface TransportVehicleService 
{
	public TransportVehicle saveVehicle(TransportVehicle t);
	public List<TransportVehicle> getAllVehicle();
}