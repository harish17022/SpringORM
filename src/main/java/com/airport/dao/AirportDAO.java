package com.airport.dao;



import com.airport.entity.AirportEntity;


public interface AirportDAO {
	void saveAirportEntity(AirportEntity entity);
	AirportEntity getAirportEntityByID(int id);
	void updateAirportEntityByName(String name);	//HQL
	void updateAirportEntityByID(int id);
	void updateAirportEntityByLocation(String location);	//HQL
	void deleteAirportEntityByID(int id);
	void getAll();
	
}
