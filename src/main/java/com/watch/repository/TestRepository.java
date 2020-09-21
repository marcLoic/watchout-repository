package com.watch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watch.entities.Test;

public interface TestRepository extends JpaRepository<Test, Long>{

	List<Test> findByProbabilityofcontaminationBetween(double start, double end);
	
}
