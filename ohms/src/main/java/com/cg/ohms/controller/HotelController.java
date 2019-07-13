package com.cg.ohms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ohms.dto.HotelDetailsDTO;
import com.cg.ohms.exceptions.HotelException;
import com.cg.ohms.service.IHotel;

@RestController
@RequestMapping(name = "/")
public class HotelController {
	
	@Autowired
	private IHotel hotel;

	public void setHotel(IHotel hotel) {
		this.hotel = hotel;
	}
	
	
	
	@RequestMapping(value = "/view", method = RequestMethod.POST,consumes="application/json", produces="application/json")
	@ResponseBody
	public HotelDetailsDTO getHotelDetails(@RequestBody HotelDetailsDTO hotelDetailsDTO) {
		
		try {
			hotel.viewHotelDetails(hotelDetailsDTO);
		} catch (HotelException e) {
			
			e.printStackTrace();
		}
		return hotelDetailsDTO;
		
	}
	
	@RequestMapping(value="/add", method= RequestMethod.POST,consumes="application/json",produces="application/json")
	
	public boolean addHotelDetails(@RequestBody HotelDetailsDTO hotelDetailsDTO) {
		boolean flag=false;
		try {
			hotel.addHotelDetails(hotelDetailsDTO);
			flag=true;
		} catch (HotelException e) {
		
			e.printStackTrace();
		}
		return flag;
		
	}
	

	@RequestMapping(value="/modify/name", method= RequestMethod.PUT,consumes="application/json",produces="application/json")
	@ResponseBody
	public boolean modifyName(@RequestBody HotelDetailsDTO hotelDetailsDTO) {
		boolean flag=false;
		try {
			hotel.modifyByHotelName(hotelDetailsDTO);
			flag=true;
		} catch (HotelException e) {
			
			e.printStackTrace();
		}
		
		return flag;
		
	}
	
	@RequestMapping(value="/modify/address", method= RequestMethod.PUT,consumes="application/json",produces="application/json")
	@ResponseBody
	public boolean modifyAddress(@RequestBody HotelDetailsDTO hotelDetailsDTO) {
		boolean flag=false;
		try {
			hotel.modifyByHotelAddress(hotelDetailsDTO);
			flag=true;
		} catch (HotelException e) {
			
			e.printStackTrace();
		}
		
		return flag;
		
	}
	@RequestMapping(value="/modify/rooms", method= RequestMethod.PUT,consumes="application/json",produces="application/json")
	@ResponseBody
	public boolean modifyRooms(@RequestBody HotelDetailsDTO hotelDetailsDTO) {
		boolean flag=false;
		try {
			hotel.modifyByNumOfRooms(hotelDetailsDTO);
			flag=true;
		} catch (HotelException e) {
			
			e.printStackTrace();
		}
		
		return flag;
		
	}
	
	@RequestMapping(value="/delete", method= RequestMethod.DELETE,consumes="application/json",produces="application/json")
	@ResponseBody
	public boolean deleteHotel(@RequestBody HotelDetailsDTO hotelDetailsDTO) {
		boolean flag=false;
		try {
			hotel.deleteHotelDetails(hotelDetailsDTO);
			flag=true;
		} catch (HotelException e) {
			
			e.printStackTrace();
		}
		
		return flag;
		
	}

}
