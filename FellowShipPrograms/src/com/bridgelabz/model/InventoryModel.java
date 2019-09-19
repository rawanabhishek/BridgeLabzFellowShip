package com.bridgelabz.model;

import java.io.Serializable;
import java.util.List;

public  class InventoryModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Rice> rice = null;
	private List<Pulse> pulses = null;
	private List<Wheat> wheats = null;
	private int total;
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Rice> getRice() {
		return rice;
		}

		public void setRice(List<Rice> rice) {
		this.rice = rice;
		}

		public List<Pulse> getPulses() {
		return pulses;
		}

		public void setPulses(List<Pulse> pulses) {
		this.pulses = pulses;
		}

		public List<Wheat> getWheats() {
		return wheats;
		}

		public void setWheats(List<Wheat> wheats) {
		this.wheats = wheats;
		}

		
	

}
