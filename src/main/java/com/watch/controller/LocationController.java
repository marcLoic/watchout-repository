package com.watch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.watch.entities.Location;
import com.watch.service.LocationService;

@RestController
public class LocationController {

	
	LocationService locationService;

	@Autowired
	public LocationController(LocationService locationService) {
		super();
		this.locationService = locationService;
	}
	
	@GetMapping("/listlocation")
	public List<Location> listLocation(){
		return locationService.listLocations();
	}
	
	@PostMapping("/addlocation")
	public Location addLocation(@RequestBody Location location){
		return locationService.addLocation(location);
	}
	
	@DeleteMapping("/deletelocation")
	public void deleteLocation(@PathVariable Long id){
		locationService.deleteLocation(id);;
	}
	
	@PutMapping("/updatelocation")
	public Location updateLocation(@RequestBody Location location){
		return locationService.updateLocation(location);
	}
}
