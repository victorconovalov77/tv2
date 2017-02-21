package com.tv2.common.model;

import java.util.Date;

public class Plan {

	String name;
	Date startDate;
	Date endDate;	
	String campains[];
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String[] getCampains() {
		return campains;
	}

	public void setCampains(String[] campains) {
		this.campains = campains;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public Plan() {
	} 
}