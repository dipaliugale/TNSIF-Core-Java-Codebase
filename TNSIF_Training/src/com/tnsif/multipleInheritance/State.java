package com.tnsif.multipleInheritance;

public class State extends Country {
	
	//dat members
	private String stateName;
	private String langl;
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLangl() {
		return langl;
	}
	public void setLangl(String langl) {
		this.langl = langl;
	}
	
	// to string
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", langl=" + langl + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
