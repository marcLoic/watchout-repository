package com.watch.service;

import java.util.List;
import java.util.Optional;

import com.watch.entities.Results;

public interface ResultsService {

	Optional<Results> results(Long id);
	
	List<Results> listResults();
	
	List<Results> addResults(List<Results> results);
	
	Results updateResults(Results results);
	
	void deleteResults(Long id);
}
