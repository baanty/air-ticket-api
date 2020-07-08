package com.cts.airticket.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cts.airticket.entity.AirportEntity;


public interface AirportRepository extends CrudRepository<AirportEntity, Integer> {
	
	List<AirportEntity> findByAirportCodeContaining(String airportCode);
	
	List<AirportEntity> findByAirportDescriptionContaining(String airportDescription);

}
