package com.watch.controller;

import java.util.ArrayList;
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
import com.watch.entities.Question;
import com.watch.entities.Results;
import com.watch.entities.Subscriber;
import com.watch.entities.Test;
import com.watch.entities.Visitor;
import com.watch.repository.QuestionRepository;
import com.watch.repository.ResultsRepository;
import com.watch.service.LocationService;
import com.watch.service.QuestionService;
import com.watch.service.ResultsService;
import com.watch.service.SubscriberService;
import com.watch.service.TestService;
import com.watch.service.VisitorService;

@RestController
public class TestController {

	TestService testService;
	
	QuestionService questionService;
	
	SubscriberService subscriberService;
	
	@Autowired
	QuestionRepository questionRepository;
	
	@Autowired
	ResultsRepository resultsRepository;
	
	@Autowired
	ResultsService resultsService;
	
	@Autowired
	LocationService locationService;
	
	@Autowired
	VisitorService visitorService;

	@Autowired
	public TestController(TestService testService) {
		super();
		this.testService = testService;
	}

	@GetMapping("/listtest")
	public List<Test> listTest() {
		return testService.listTest();
	}

	// http://localhost:8080/addTestSubsriber
	@PostMapping("/addTestSubsriber")
	public Test addTestSubsriber(@RequestBody Test test) {
		test.setLocation(locationService.addLocation(test.getLocation()));;
		List<Results> results = new ArrayList<>();
		List<Results> positiveResults = new ArrayList<>();
		// for loop to get the positive results
		for(Results result : test.getResults()) {
			if(result.isAnswer()) {
				positiveResults.add(result);
			}
		}
		int levelofpriority = 0;
		// for loop to get the total number question rows
		for(Results result : positiveResults) {
			levelofpriority = levelofpriority + result.getQuestion().getLevelofpriority();
		}
		float questionTotalRows = (questionRepository.count() * 10);
		float probabilityOfContamination = (levelofpriority * 100) / questionTotalRows;
		test.setProbabilityofcontamination(probabilityOfContamination);
		Test testsaved = testService.addTest(test);
		// for loop to set the test ids in the results
		for(Results result : test.getResults()) {
			result.setTest(testsaved);
			results.add(result);
		}
		resultsService.addResults(results);
		return update(testsaved);
	}

	// http://localhost:8080/addTestVisitor
	@PostMapping("/addTestVisitor")
	public Test addTestVisitor(@RequestBody Test test) {
		// saving the location of the visitor
		test.setLocation(locationService.addLocation(test.getLocation()));
		// saving the visitor doing the test
		test.setVisitor(visitorService.addVisitors(test.getVisitor()));
		List<Results> results = new ArrayList<>();
		List<Results> positiveResults = new ArrayList<>();
		// for loop to get the positive results
		for(Results result : test.getResults()) {
			if(result.isAnswer()) {
				positiveResults.add(result);
			}
		}
		int levelofpriority = 0;
		// for loop to get the total number question rows
		for(Results result : positiveResults) {
			levelofpriority = levelofpriority + result.getQuestion().getLevelofpriority();
		}
		float questionTotalRows = (questionRepository.count() * 10);
		float probabilityOfContamination = (levelofpriority * 100) / questionTotalRows;
		test.setProbabilityofcontamination(probabilityOfContamination);
		Test testsaved = testService.addTest(test);
		// for loop to set the test ids in the results
		for(Results result : test.getResults()) {
			result.setTest(testsaved);
			results.add(result);
		}
		resultsService.addResults(results);
		return update(testsaved);
	}

	@DeleteMapping("/deletetest")
	public void deleteTest(@PathVariable Long id) {
		testService.deleteTest(id);
		;
	}

	@PutMapping("/updatetest")
	public Test updateTest(@RequestBody Test test) {
		return testService.updateTest(test);
	}
	
	// number of tested people
	@GetMapping("/listtestcategorie0")
	public long categorie0() {
		return testService.categorie0();
	}
	
	// tested people with probability of contamination between 0 and 24 percent
	@GetMapping("/listtestcategorie1")
	public long categorie1() {
		return testService.categorie1();
	}

	// tested people with probability of contamination between 25 and 50 percent
	@GetMapping("/listtestcategorie2")
	public long categorie2() {
		return testService.categorie2();
	}

	// tested people with probability of contamination between 51 and 75 percent
	@GetMapping("/listtestcategorie3")
	public long categorie3() {
		return testService.categorie3();
	}

	// tested people with probability of contamination between 76 and 100 percent
	@GetMapping("/listtestcategorie4")
	public long categorie4() {
		return testService.categorie4();
	}
	
	public Test update(Test test) {
		return testService.updateTest(test);
	}
}
