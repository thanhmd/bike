package com.globalmatics.bike.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Bike {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private boolean contact;
	private String email;
	private String model;
	private String name;
	private String phone;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
	private Date purchaseDate;
	private BigDecimal purchasePrice;
	private String serialNumber;

	public String getEmail() {
		return email;
	}

	public Long getId() {
		return id;
	}

	public String getModel() {
		return model;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public boolean isContact() {
		return contact;
	}

	public void setContact(boolean contact) {
		this.contact = contact;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

}
