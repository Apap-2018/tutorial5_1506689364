package com.apap.tutorial5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apap.tutorial5.model.FlightModel;
import com.apap.tutorial5.repository.FlightDB;

/**
 * 
 * FlightServiceImpl
 *
 */

@Service
@Transactional
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightDB flightDb;
	
	@Override
	public void addFlight(FlightModel flight) {
		flightDb.save(flight);
	}
	
	@Override
	public void deleteFlightByID(Long id) {
		flightDb.deleteById(id);
	}
	
	@Override
	public FlightModel getFlightDetailById(Long id) {
		return flightDb.getOne(id);
	}
	
	@Override
	public List<FlightModel> getFlightList(){
		return flightDb.findAll();
	}

}
