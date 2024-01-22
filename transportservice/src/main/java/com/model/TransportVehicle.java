package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TransportVehicle 
{
	@Id
	private int vehicleId;
	private String vehicleType;
	private int capacity;
	private String availabilityStatus;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getAvailabilityStatus() {
		return availabilityStatus;
	}
	public void setAvailabilityStatus(String availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}
	public TransportVehicle(int vehicleId, String vehicleType, int capacity, String availabilityStatus) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.capacity = capacity;
		this.availabilityStatus = availabilityStatus;
	}
	@Override
	public String toString() {
		return "TransportVehicle [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + ", capacity=" + capacity
				+ ", availabilityStatus=" + availabilityStatus + "]";
	}
	public TransportVehicle() {
		super();
	}
	
	
}

