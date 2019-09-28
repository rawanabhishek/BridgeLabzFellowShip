package com.bridgelabz.creational.builder;

public class Bycycle {

	private String company;
	private String frameType;
	private String frameSize;
	private String wheelSize;
	private String cycleType;

	public Bycycle(String company, String frameType, String frameSize, String wheelSize, String cycleType) {
		super();
		this.company = company;
		this.frameType = frameType;
		this.frameSize = frameSize;
		this.wheelSize = wheelSize;
		this.cycleType = cycleType;
		
	}

	@Override
	public String toString() {
		return "Bycycle [company=" + company + ", frameType=" + frameType + ", frameSize=" + frameSize + ", wheelSize="
				+ wheelSize + ", cycleType=" + cycleType + "]";
	}
	

}
