package com.watch.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watch.entities.Results;
import com.watch.repository.ResultsRepository;
import com.watch.service.ResultsService;

@Service
public class ResultsImplementation implements ResultsService{

	ResultsRepository resultsRepository;
	
	@Autowired
	public ResultsImplementation(ResultsRepository resultsRepository) {
		super();
		this.resultsRepository = resultsRepository;
	}

	@Override
	public Optional<Results> results(Long id) {
		return resultsRepository.findById(id);
	}

	@Override
	public List<Results> listResults() {
		return resultsRepository.findAll();
	}

	@Override
	public List<Results> addResults(List<Results> results) {
		return resultsRepository.saveAll(results);
	}

	@Override
	public Results updateResults(Results results) {
		return resultsRepository.save(results);
	}

	@Override
	public void deleteResults(Long id) {
		resultsRepository.deleteById(id);
	}

}
