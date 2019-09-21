package com.bridgelabz.model;

import java.util.List;

public class Adressbook {
	
	private List<Mh> mh;
	private List<Mp> mp;
	private List<Wb> wb;
	private List<Gj> gj;
	private String statename;

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public List<Mh> getMh() {
		return mh;
	}

	public void setMh(List<Mh> mh) {
		this.mh = mh;
	}

	public List<Mp> getMp() {
		return mp;
	}

	public void setMp(List<Mp> mp) {
		this.mp = mp;
	}

	public List<Wb> getWb() {
		return wb;
	}

	public void setWb(List<Wb> wb) {
		this.wb = wb;
	}

	public List<Gj> getGj() {
		return gj;
	}

	public void setGj(List<Gj> gj) {
		this.gj = gj;
	}
	
	@Override
	public String toString() {
		return "Adressbook [mh=" + mh + ", mp=" + mp + ", wb=" + wb + ", gj=" + gj + "]";
	}


}
