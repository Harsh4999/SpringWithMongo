package com.harsh.resources;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;
@Data
@Document
@ToString
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@Indexed(unique=true)
	private String firstName;
	private String lastName;
	private Gender gender;
	private Address address;
	private List<String> favouriteSubjects;
	private BigDecimal totalSpentInBooks;
	private LocalDateTime createdAt;
	public Student(String firstName, String lastName, Gender gender, Address address, List<String> favouriteSubjects,
			BigDecimal totalSpentInBooks, LocalDateTime createdAt) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.favouriteSubjects = favouriteSubjects;
		this.totalSpentInBooks = totalSpentInBooks;
		this.createdAt = createdAt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<String> getFavouriteSubjects() {
		return favouriteSubjects;
	}
	public void setFavouriteSubjects(List<String> favouriteSubjects) {
		this.favouriteSubjects = favouriteSubjects;
	}
	public BigDecimal getTotalSpentInBooks() {
		return totalSpentInBooks;
	}
	public void setTotalSpentInBooks(BigDecimal totalSpentInBooks) {
		this.totalSpentInBooks = totalSpentInBooks;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	
}
