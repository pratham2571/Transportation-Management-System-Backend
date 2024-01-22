package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seeds 
{
	@Id
	private int seedssId;
	private String sdescription;
	private int squantity;
	private String spickupLocation;
	private String sdeliveryLocation;
	private String sstatus;
	public int getSeedssId() {
		return seedssId;
	}
	public void setSeedssId(int seedssId) {
		this.seedssId = seedssId;
	}
	public String getSdescription() {
		return sdescription;
	}
	public void setSdescription(String sdescription) {
		this.sdescription = sdescription;
	}
	public int getSquantity() {
		return squantity;
	}
	public void setSquantity(int squantity) {
		this.squantity = squantity;
	}
	public String getSpickupLocation() {
		return spickupLocation;
	}
	public void setSpickupLocation(String spickupLocation) {
		this.spickupLocation = spickupLocation;
	}
	public String getSdeliveryLocation() {
		return sdeliveryLocation;
	}
	public void setSdeliveryLocation(String sdeliveryLocation) {
		this.sdeliveryLocation = sdeliveryLocation;
	}
	public String getSstatus() {
		return sstatus;
	}
	public void setSstatus(String sstatus) {
		this.sstatus = sstatus;
	}
	public Seeds(int seedssId, String sdescription, int squantity, String spickupLocation, String sdeliveryLocation,
			String sstatus) {
		super();
		this.seedssId = seedssId;
		this.sdescription = sdescription;
		this.squantity = squantity;
		this.spickupLocation = spickupLocation;
		this.sdeliveryLocation = sdeliveryLocation;
		this.sstatus = sstatus;
	}
	@Override
	public String toString() {
		return "Seeds [seedssId=" + seedssId + ", sdescription=" + sdescription + ", squantity=" + squantity
				+ ", spickupLocation=" + spickupLocation + ", sdeliveryLocation=" + sdeliveryLocation + ", sstatus="
				+ sstatus + "]";
	}
	public Seeds() {
		super();
	}
	
	
}
