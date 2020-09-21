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

import com.watch.entities.Statistics;
import com.watch.service.StatisticsService;

@RestController
public class StatisticsController {

	
	StatisticsService statisticsService;

	@Autowired
	public StatisticsController(StatisticsService statisticsService) {
		super();
		this.statisticsService = statisticsService;
	}
	
	@GetMapping("/liststatistics")
	public List<Statistics> listAdmin(){
		return statisticsService.listStatistics();
	}
	
	@PostMapping("/addstatistics")
	public Statistics addStatistics(@RequestBody Statistics statistics){
		return statisticsService.addStatistics(statistics);
	}
	
	@DeleteMapping("/deletestatistics")
	public void deleteStatistics(@PathVariable Long id){
		statisticsService.deleteStatistics(id);;
	}
	
	@PutMapping("/updatestatistics")
	public Statistics updateStatistics(@RequestBody Statistics statistics){
		return statisticsService.updateStatistics(statistics);
	}
}
