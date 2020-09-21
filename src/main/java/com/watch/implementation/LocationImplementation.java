package com.watch.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watch.entities.Location;
import com.watch.repository.LocationRepository;
import com.watch.service.LocationService;

@Service
public class LocationImplementation implements LocationService {

	
	public LocationRepository locationRepository;
	
	@Autowired
	public LocationImplementation(LocationRepository locationRepository) {
		super();
		this.locationRepository = locationRepository;
	}

	@Override
	public List<Location> listLocations() {
		return locationRepository.findAll();
	}

	@Override
	public Location addLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocation(Long id) {
		locationRepository.deleteById(id);
	}

	@Override
	public Location updateLocation(Location location) {
		return locationRepository.save(location);
	}
}
