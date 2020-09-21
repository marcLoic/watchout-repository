package com.watch.service;

import java.util.List;

import com.watch.entities.Statistics;

public interface StatisticsService {

	List<Statistics> listStatistics();
	
	Statistics addStatistics(Statistics statistics);
	
	void deleteStatistics(Long id);
	
	Statistics updateStatistics(Statistics statistics);
}
