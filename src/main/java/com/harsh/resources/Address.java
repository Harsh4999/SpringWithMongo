package com.harsh.resources;

import java.io.Serializable;

import lombok.Data;

@Data
public class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String country;
	private String city;
	private String postCode;
	public Address(String country, String city, String postCode) {
		super();
		this.country = country;
		this.city = city;
		this.postCode = postCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
}
