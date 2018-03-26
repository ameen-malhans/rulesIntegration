package com.agilemaple.model;

import java.util.ArrayList;
import java.util.List;

public class Payment {

	private String type;
	private List<String> output = new ArrayList();
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getOutput() {
		return output;
	}

	public void setOutput(List<String> output) {
		this.output = output;
	}


}
