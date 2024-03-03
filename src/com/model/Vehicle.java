package com.model;

public class Vehicle {

	private int regId;
	private String modelName;
	private float price;
	private String colour;
	private String area;
	private String ownerName;
	private long mob;
	private long adhar;
	
	public void setRegId(int regId) {
		this.regId=regId;
	}
	public int getRegId() {
		return regId;
	}
	
	
	public void setModelName(String modelName) {
        this.modelName=modelName;		
	}
	public String getModelName() {
		return modelName;
	}
	
	
	public void setPrice(float price) {
		this.price=price;
	}
	public float getPrice() {
		return price;
	}
	
	
	public void setColour(String colour) {
		this.colour=colour;
	}
	public String getColour() {
		return colour;
	}
	
	
	public void setArea(String area) {
		this.area=area;
	}
	public String getArea() {
		return area;
	}
	
	
	public void setOwnerName(String ownerName) {
		this.ownerName=ownerName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	
	
	public void setMob(long mob) {
		this.mob=mob;
	}
	public long getMob() {
		return mob;
	}
	
	
	public void setAdhar(long adhar) {
		this.adhar=adhar;
	}
	public long getAdhar() {
		return adhar;
	}
}
