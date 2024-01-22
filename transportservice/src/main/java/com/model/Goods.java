package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Goods 
{
	@Id
	private int goodsId;
	private String description;
	private int quantity;
	private String pickupLocation;
	private String deliveryLocation;
	private String status;
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getDeliveryLocation() {
		return deliveryLocation;
	}
	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Goods(int goodsId, String description, int quantity, String pickupLocation, String deliveryLocation,
			String status) {
		super();
		this.goodsId = goodsId;
		this.description = description;
		this.quantity = quantity;
		this.pickupLocation = pickupLocation;
		this.deliveryLocation = deliveryLocation;
		this.status = status;
	}
	public Goods() {
		super();
	}
	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", description=" + description + ", quantity=" + quantity
				+ ", pickupLocation=" + pickupLocation + ", deliveryLocation=" + deliveryLocation + ", status=" + status
				+ "]";
	}
	
	
}

