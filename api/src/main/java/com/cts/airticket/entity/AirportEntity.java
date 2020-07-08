package com.cts.airticket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AIRPORTS" )
public class AirportEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "AIRPORT_CODE")
	private String airportCode;
	
	@Column(name = "AIRPORT_DESCRIPTION")
	private String airportDescription;
	
	@Column(name = "AIRPORT_X_CORDINATE")
	private int airportXCordinate;
	
	@Column(name = "AIRPORT_Y_CORDINATE")
	private int airportYCordinate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public String getAirportDescription() {
		return airportDescription;
	}

	public void setAirportDescription(String airportDescription) {
		this.airportDescription = airportDescription;
	}

	public int getAirportXCordinate() {
		return airportXCordinate;
	}

	public void setAirportXCordinate(int airportXCordinate) {
		this.airportXCordinate = airportXCordinate;
	}

	public int getAirportYCordinate() {
		return airportYCordinate;
	}

	public void setAirportYCordinate(int airportYCordinate) {
		this.airportYCordinate = airportYCordinate;
	}

	
	
}
