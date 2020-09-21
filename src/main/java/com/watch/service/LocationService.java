package com.watch.service;

import java.util.List;

import com.watch.entities.Location;

public interface LocationService {

	List<Location> listLocations();
	
	Location addLocation(Location location);
	
	void deleteLocation(Long id);
	
	Location updateLocation(Location location);

}
