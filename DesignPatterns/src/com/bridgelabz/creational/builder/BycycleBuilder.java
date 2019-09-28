package com.bridgelabz.creational.builder;

public class BycycleBuilder {
	private String company;
	private String frameType;
	private String frameSize;
	private String wheelSize;
	private String cycleType;

	public BycycleBuilder setCompany(String company) {
		this.company = company;
		return this;
	}

	public BycycleBuilder setFrameType(String frameType) {
		this.frameType = frameType;
		return this;
	}

	public BycycleBuilder setFrameSize(String frameSize) {
		this.frameSize = frameSize;
		return this;
		
	}

	public BycycleBuilder setWheelSize(String wheelSize) {
		this.wheelSize = wheelSize;
		return this;
	}

	public BycycleBuilder setType(String type) {
		this.cycleType = type;
		return this;
	}
	
	public Bycycle getBycycle() {
		return new Bycycle(company ,frameType ,frameSize,wheelSize,cycleType);
	}

}
