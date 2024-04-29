package com.airport.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airport_table")
public class AirportEntity implements java.io.Serializable{
	@Id
	@Column(name = "AIRPORT_ID")
	private int airportID;
	
	@Column(name = "AIRPORT_NAME")
	private String airportName;
	
	@Column(name = "AIRPORT_LOCATION")
	private String airportLocation;
	
	@Column(name = "NO_OF_PLANES")
	private int noOfPlanes;
	
	@Column(name = "NO_OF_RUNWAYS")
	private int noOfRunways;

	public int getAirportID() {
		return airportID;
	}

	public void setAirportID(int airportID) {
		this.airportID = airportID;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportLocation() {
		return airportLocation;
	}

	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}

	public int getNoOfPlanes() {
		return noOfPlanes;
	}

	public void setNoOfPlanes(int noOfPlanes) {
		this.noOfPlanes = noOfPlanes;
	}

	public int getNoOfRunways() {
		return noOfRunways;
	}

	public void setNoOfRunways(int noOfRunways) {
		this.noOfRunways = noOfRunways;
	}
	
	public AirportEntity() {
		
	}
	public AirportEntity(int airportID, String airportName, String airportLocation, int noOfPlanes, int noOfRunways) {
		super();
		this.airportID = airportID;
		this.airportName = airportName;
		this.airportLocation = airportLocation;
		this.noOfPlanes = noOfPlanes;
		this.noOfRunways = noOfRunways;
	}

	@Override
	public String toString() {
		return "AirportEntity [airportID=" + airportID + ", airportName=" + airportName + ", airportLocation="
				+ airportLocation + ", noOfPlanes=" + noOfPlanes + ", noOfRunways=" + noOfRunways + "]";
	}

	
	
	
	
}
