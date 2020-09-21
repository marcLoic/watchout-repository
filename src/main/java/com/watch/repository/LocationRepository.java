package com.watch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.watch.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{
	
}
