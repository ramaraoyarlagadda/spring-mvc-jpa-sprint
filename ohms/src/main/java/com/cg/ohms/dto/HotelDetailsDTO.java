package com.cg.ohms.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
 @Table(name="hoteldetailsdto")
public class HotelDetailsDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HOTELID")
	@SequenceGenerator(name = "HOTELID", sequenceName = "HOTELID")
	@Column(name = "hotelid")
	private int hotelId;
	@Column(name = "hotelname")
	private String hotelName;
	@Column(name = "hoteladdress")
	private String hotelAddress;
	@Column(name = "numberofrooms")
	private int numOfRooms;

	public HotelDetailsDTO() {

	}

	public HotelDetailsDTO(int hotelId, String hotelName, String hotelAddress, int numOfRooms) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.numOfRooms = numOfRooms;
	}

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

	public int getNumOfRooms() {
		return numOfRooms;
	}

	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}

	@Override
	public String toString() {
		return " hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddress=" + hotelAddress + ", numOfRooms="
				+ numOfRooms;
	}

}
