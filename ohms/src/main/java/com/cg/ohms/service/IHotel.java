package com.cg.ohms.service;

import com.cg.ohms.dto.HotelDetailsDTO;
import com.cg.ohms.exceptions.HotelException;

public interface IHotel {

	public boolean addHotelDetails(HotelDetailsDTO hotelDetailsDTO) throws HotelException;

	public boolean deleteHotelDetails(HotelDetailsDTO hotelDetailsDTO) throws HotelException;

	public HotelDetailsDTO viewHotelDetails(HotelDetailsDTO viewId) throws HotelException;

	public boolean modifyByHotelName(HotelDetailsDTO hotelDetailsDTO) throws HotelException;

	public boolean modifyByHotelAddress(HotelDetailsDTO hotelDetailsDTO) throws HotelException;

	public boolean modifyByNumOfRooms(HotelDetailsDTO hotelDetailsDTO) throws HotelException;

}
