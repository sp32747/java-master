package com.sree.lambdatest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Project{

	

	private String projectCode;
	private String name ;
	private String client;
	private String buLeadName;
	
	public Project(String projectCode, String name, String client, String buLeadName) {
		super();
		this.projectCode = projectCode;
		this.name = name;
		this.client = client;
		this.buLeadName = buLeadName;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getBuLeadName() {
		return buLeadName;
	}

	public void setBuLeadName(String buLeadName) {
		this.buLeadName = buLeadName;
	}
	
	
}