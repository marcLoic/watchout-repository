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

import com.watch.entities.Results;
import com.watch.service.ResultsService;

@RestController
public class ResultsController {

	ResultsService resultsService;

	@Autowired
	public ResultsController(ResultsService resultsService) {
		super();
		this.resultsService = resultsService;
	}
	
	@GetMapping("/listresults")
	public List<Results> listResults(){
		return resultsService.listResults();
	}
	
	@PostMapping("/addresults")
	public List<Results> addResults(@RequestBody List<Results> results){
		return resultsService.addResults(results);
	}
	
	@DeleteMapping("/deleteresults")
	public void deleteResults(@PathVariable Long id){
		resultsService.deleteResults(id);;
	}
	
	@PutMapping("/updateresults")
	public Results updateResults(@RequestBody Results results){
		return resultsService.updateResults(results);
	}
}
