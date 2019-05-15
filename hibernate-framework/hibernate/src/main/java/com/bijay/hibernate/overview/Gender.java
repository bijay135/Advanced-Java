package com.bijay.hibernate.overview;

public enum Gender {

	MALE("Male"), FEMALE("Female");

	private String name;

	private Gender(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
