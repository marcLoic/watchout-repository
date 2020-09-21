package com.watch.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watch.entities.Statistics;
import com.watch.repository.StatisticsRepository;
import com.watch.service.StatisticsService;

@Service
public class StatisticsImplementation implements StatisticsService{

	
	StatisticsRepository statisticsRepository;
	
	@Autowired
	public StatisticsImplementation(StatisticsRepository statisticsRepository) {
		super();
		this.statisticsRepository = statisticsRepository;
	}

	@Override
	public List<Statistics> listStatistics() {
		return statisticsRepository.findAll();
	}

	@Override
	public Statistics addStatistics(Statistics statistics) {
		return statisticsRepository.save(statistics);
	}

	@Override
	public void deleteStatistics(Long id) {
		statisticsRepository.deleteById(id);
	}

	@Override
	public Statistics updateStatistics(Statistics statistics) {
		return statisticsRepository.save(statistics);
	}

}
