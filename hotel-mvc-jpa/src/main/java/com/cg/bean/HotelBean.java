package com.cg.bean;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

@Repository
@Table(name = "hotel")
public class HotelBean {

	@Id
	private int hotelId;
	private String hotelName;
	private String hotelAddress;
	private String phoneNumber;
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
}
