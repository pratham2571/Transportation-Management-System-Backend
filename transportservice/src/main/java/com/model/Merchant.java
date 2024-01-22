package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Merchant 
{
	@Id
	private int merchantId;
	private String merchantName;
	private String merchantPassword;
	private Long mMobNo;
	private String emailId;
	private String merchantAddress;
	
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Seeds>seeds;

	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantPassword() {
		return merchantPassword;
	}

	public void setMerchantPassword(String merchantPassword) {
		this.merchantPassword = merchantPassword;
	}

	public Long getmMobNo() {
		return mMobNo;
	}

	public void setmMobNo(Long mMobNo) {
		this.mMobNo = mMobNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMerchantAddress() {
		return merchantAddress;
	}

	public void setMerchantAddress(String merchantAddress) {
		this.merchantAddress = merchantAddress;
	}

	public List<Seeds> getSeeds() {
		return seeds;
	}

	public void setSeeds(List<Seeds> seeds) {
		this.seeds = seeds;
	}

	@Override
	public String toString() {
		return "Merchant [merchantId=" + merchantId + ", merchantName=" + merchantName + ", merchantPassword="
				+ merchantPassword + ", mMobNo=" + mMobNo + ", emailId=" + emailId + ", merchantAddress="
				+ merchantAddress + ", seeds=" + seeds + "]";
	}

	public Merchant(int merchantId, String merchantName, String merchantPassword, Long mMobNo, String emailId,
			String merchantAddress, List<Seeds> seeds) {
		super();
		this.merchantId = merchantId;
		this.merchantName = merchantName;
		this.merchantPassword = merchantPassword;
		this.mMobNo = mMobNo;
		this.emailId = emailId;
		this.merchantAddress = merchantAddress;
		this.seeds = seeds;
	}

	public Merchant() {
		super();
	}

	

	 	
}
