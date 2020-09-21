package com.watch.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watch.entities.Test;
import com.watch.repository.TestRepository;
import com.watch.service.TestService;

@Service
public class TestImplementation implements TestService {

	
	TestRepository testRepository;
	
	@Autowired
	public TestImplementation(TestRepository testRepository) {
		super();
		this.testRepository = testRepository;
	}

	@Override
	public List<Test> listTest() {
		return testRepository.findAll();
	}

	@Override
	public Test addTest(Test test) {
	return testRepository.save(test);
	}

	@Override
	public void deleteTest(Long id) {
		testRepository.deleteById(id);
	}

	@Override
	public Test updateTest(Test test) {
		return testRepository.save(test);
	}

	// number of tested people
	@Override
	public long categorie0() {
		return testRepository.findAll().size();
	}

	// number of tested people with probability of contamination between 0 and 24 percent
	@Override
	public long categorie1() {
		return testRepository.findByProbabilityofcontaminationBetween(0.0, 24.0).size();
	}

	// number of tested people with probability of contamination between 25 and 50 percent
	@Override
	public long categorie2() {
		return testRepository.findByProbabilityofcontaminationBetween(25.0, 50.0).size();
	}

	// number of tested people with probability of contamination between 51 and 75 percent
	@Override
	public long categorie3() {
		return testRepository.findByProbabilityofcontaminationBetween(51.0, 75.0).size();
	}

	// number of tested people with probability of contamination between 76 and 100 percent
	@Override
	public long categorie4() {
		return testRepository.findByProbabilityofcontaminationBetween(76.0, 100.0).size();
	}

}
