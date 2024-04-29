package com.airport.service;

import com.airport.entity.AirportEntity;

public interface AirportService {
	boolean validateAirportEntity(AirportEntity entity);
	boolean validateId(int id);
	boolean validateName(String name);
	boolean validateLocation(String location);
}
