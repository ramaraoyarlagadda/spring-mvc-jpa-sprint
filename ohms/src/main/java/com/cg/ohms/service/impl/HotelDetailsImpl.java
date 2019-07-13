package com.cg.ohms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ohms.dao.HotelDetailsDaoImpl;
import com.cg.ohms.dao.IHotelDetailsDao;
import com.cg.ohms.dto.HotelDetailsDTO;
import com.cg.ohms.exceptions.HotelException;
import com.cg.ohms.service.IHotel;
import com.cg.ohms.utility.ExceptionMessages;
import com.cg.ohms.utility.ValidateHotelDetails;

@Service
public class HotelDetailsImpl implements IHotel {

	@Autowired
	private IHotelDetailsDao hotelDetailsDao;

	public void setHotelDetailsDao(IHotelDetailsDao hotelDetailsDao) {
		this.hotelDetailsDao = hotelDetailsDao;
	}

	ValidateHotelDetails validate = new ValidateHotelDetails();
	boolean result;

	public boolean addHotelDetails(HotelDetailsDTO hotelDetails) throws HotelException {
		boolean flag;
		try {
			HotelDetailsDaoImpl hotelDetailsDaoImpl = new HotelDetailsDaoImpl();
			String hotelName = hotelDetails.getHotelName();
			validate.isValidHotelName(hotelName);
			String hotelAddress = hotelDetails.getHotelAddress();
			validate.isValidHotelAddress(hotelAddress);
			int noofRooms = hotelDetails.getNumOfRooms();
			validate.isValidNumberOfRooms(noofRooms);
			flag = hotelDetailsDaoImpl.addDetails(hotelDetails);
		} catch (HotelException e) {
			throw new HotelException(ExceptionMessages.ADDINGERROR);
		}

		System.out.println(flag);
		return true;

	}

	public HotelDetailsDTO viewHotelDetails(HotelDetailsDTO hotelDetailsDTO) throws HotelException {

		 hotelDetailsDao.viewDetails(hotelDetailsDTO);
		return hotelDetailsDTO;

	}

	public boolean modifyByHotelName(HotelDetailsDTO hotelDetailsDTO) throws HotelException {

//		IHotelDetailsDao hotelDetailsDao = new HotelDetailsDaoImpl();
		 result = hotelDetailsDao.modifyName(hotelDetailsDTO);
		return result;
	}

	public boolean modifyByHotelAddress(HotelDetailsDTO hotelDetailsDTO) throws HotelException {
		result = hotelDetailsDao.modifyName(hotelDetailsDTO);
		return result;
	}

	public boolean modifyByNumOfRooms(HotelDetailsDTO hotelDetailsDTO) throws HotelException {
		result = hotelDetailsDao.modifyName(hotelDetailsDTO);
		return result;
	}

	public boolean deleteHotelDetails(HotelDetailsDTO hotelDetailsDTO) throws HotelException {
		
		boolean flag = hotelDetailsDao.deleteDetails(hotelDetailsDTO);
		return flag;
	}
}
