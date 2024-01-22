package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Farmer 
{
	@Id
	private int farmerId;
	private String farmerName;
	private String farmerPassword;
	private Long fMobNo;
	private String femailId;
	private String farmerAddress;
	
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Goods>goods;

	public int getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public String getFarmerName() {
		return farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public String getFarmerPassword() {
		return farmerPassword;
	}

	public void setFarmerPassword(String farmerPassword) {
		this.farmerPassword = farmerPassword;
	}

	public Long getfMobNo() {
		return fMobNo;
	}

	public void setfMobNo(Long fMobNo) {
		this.fMobNo = fMobNo;
	}

	public String getFemailId() {
		return femailId;
	}

	public void setFemailId(String femailId) {
		this.femailId = femailId;
	}

	public String getFarmerAddress() {
		return farmerAddress;
	}

	public void setFarmerAddress(String farmerAddress) {
		this.farmerAddress = farmerAddress;
	}

	public List<Goods> getGoods() {
		return goods;
	}

	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}

	public Farmer(int farmerId, String farmerName, String farmerPassword, Long fMobNo, String femailId,
			String farmerAddress, List<Goods> goods) {
		super();
		this.farmerId = farmerId;
		this.farmerName = farmerName;
		this.farmerPassword = farmerPassword;
		this.fMobNo = fMobNo;
		this.femailId = femailId;
		this.farmerAddress = farmerAddress;
		this.goods = goods;
	}

	@Override
	public String toString() {
		return "Farmer [farmerId=" + farmerId + ", farmerName=" + farmerName + ", farmerPassword=" + farmerPassword
				+ ", fMobNo=" + fMobNo + ", femailId=" + femailId + ", farmerAddress=" + farmerAddress + ", goods="
				+ goods + "]";
	}

	public Farmer() {
		super();
	}

	
}

