package com.bijay.servlet.hibernate.app.data.model;

import com.bijay.servlet.hibernate.app.util.StringUtil;

public enum Gender {
	MALE("Male"),
	FEMALE("Female");
	
	private String name;
	
	private Gender(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static Gender getGender(String name) {
		if(StringUtil.hasContent(name) && name.trim().toLowerCase().equals("male")) {
			return MALE;
		} else if (StringUtil.hasContent(name) && name.trim().toLowerCase().equals("female")) {
			return FEMALE;
		}
		return null;
	}
}
