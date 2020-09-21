package com.watch.service;

import java.util.List;

import com.watch.entities.Test;

public interface TestService {

	List<Test> listTest();
	
	Test addTest(Test test);
	
	void deleteTest(Long id);
	
	Test updateTest(Test test);
	
	// number of tested people
	long categorie0();
	
	// number of tested people with probability of contamination between 0 and 24 percent
	long categorie1();
	
	// number of tested people with probability of contamination between 25 and 50 percent
	long categorie2();
	
	// number of tested people with probability of contamination between 51 and 75 percent
	long categorie3();
	
	// number of tested people with probability of contamination between 76 and 100 percent
	long categorie4();
}
