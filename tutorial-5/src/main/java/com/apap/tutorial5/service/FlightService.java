package com.apap.tutorial5.service;

import java.util.List;

import com.apap.tutorial5.model.FlightModel;

/**
 * FlightService
 *
 */
public interface FlightService {
	void addFlight(FlightModel flight);
	void deleteFlightByID(Long id);
	FlightModel getFlightDetailById(Long id);
	List<FlightModel> getFlightList();

}
