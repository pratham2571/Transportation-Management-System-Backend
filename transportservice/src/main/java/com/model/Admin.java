package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin 
{
	@Id
	private int adminId;
	private String adminName;
	private String adminPassword;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Role> role;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<TransportVehicle> vehicles;
	
	@OneToMany(fetch=FetchType.EAGER,cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},orphanRemoval = true)
	private List<Farmer> fList;
	
	@OneToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},orphanRemoval = true)
	private List<Merchant> mList;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<Role> role) {
		this.role = role;
	}

	public List<TransportVehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<TransportVehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public List<Farmer> getfList() {
		return fList;
	}

	public void setfList(List<Farmer> fList) {
		this.fList = fList;
	}

	public List<Merchant> getmList() {
		return mList;
	}

	public void setmList(List<Merchant> mList) {
		this.mList = mList;
	}

	public Admin(int adminId, String adminName, String adminPassword, List<Role> role, List<TransportVehicle> vehicles,
			List<Farmer> fList, List<Merchant> mList) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.role = role;
		this.vehicles = vehicles;
		this.fList = fList;
		this.mList = mList;
	}

	public Admin() {
		super();
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword + ", role="
				+ role + ", vehicles=" + vehicles + ", fList=" + fList + ", mList=" + mList + "]";
	}
	
	
}

