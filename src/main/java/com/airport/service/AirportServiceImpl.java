package com.airport.service;

import org.springframework.stereotype.Component;

import com.airport.entity.AirportEntity;
@Component
public class AirportServiceImpl implements AirportService {

	@Override
	public boolean validateAirportEntity(AirportEntity entity) {
		boolean flag = false;
		if(entity == null) {
			throw new IllegalArgumentException("Airport Entity cannot be Null...");
		}
		if(!(entity.getAirportName() == null) && !entity.getAirportName().isEmpty() && !entity.getAirportName().isBlank()) {
			flag=true;
			
		}
		else {
			System.out.println("AirportName is not Valid...!!!");
			flag=false;
		}
		
		if(!(entity.getAirportLocation() == null) && !entity.getAirportLocation().isEmpty() && !entity.getAirportLocation().isBlank()) {
			flag=true;
		}
		else {
			System.out.println("AirportLocation is not Valid...!!!");
			flag=false;
		}
		if(entity.getNoOfPlanes() > 0 ) {
			flag = true;
		}
		else {
			System.out.println("No Of Planes is Not Valid...!!!");
			flag=false;
		}
		if(entity.getNoOfRunways() > 0 ) {
			flag = true;
		}
		else {
			System.out.println("No Of Runways is Not Valid...!!!");
			flag=false;
		}
		return flag;
	}

	@Override
	public boolean validateId(int id) {
		if(id > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validateName(String name) {
		if(name  != null && !name.isEmpty() && !name.isBlank()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validateLocation(String location) {
		if(location != null && !location.isEmpty() && !location.isBlank()) {
			return true;
		}
		return false;
	}

}
