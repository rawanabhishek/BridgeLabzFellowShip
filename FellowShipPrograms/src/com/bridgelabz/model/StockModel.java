package com.bridgelabz.model;

import java.io.Serializable;
import java.util.List;

public class StockModel implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private List<Tata> tcs = null;
	private List<Hdfc> hdfc = null;
	private List<Zee> zee = null;
	private int valueOfAllStock;

	
	

	

	public List<Tata> getTata() {
		return tcs;
	}

	public void setTata(List<Tata> tcs) {
		this.tcs = tcs;
	}

	public List<Hdfc> getHdfc() {
		return hdfc;
	}

	public void setHdfc(List<Hdfc> hdfc) {
		this.hdfc = hdfc;
	}

	public List<Zee> getZee() {
		return zee;
	}

	public void setZee(List<Zee> zee) {
		this.zee = zee;
	}




	public int getValueOfAllStock() {
		return valueOfAllStock;
	}

	public void setValueOfAllStock(int valueOfAllStock) {
		this.valueOfAllStock = valueOfAllStock;
	}

}
