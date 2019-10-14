package com.springdem.model;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tigger {
	
	private String tiggerName;

	public String getTiggerName() {
		return tiggerName;
	}

	
	@Value("红老虎")
	public void setTiggerName(String tiggerName) {
		this.tiggerName = tiggerName;
	}

	@Override
	public String toString() {
		return "Tigger [tiggerName=" + tiggerName + "]";
	}
	

}
