package com.watch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watch.entities.Visitor;

public interface VisitorRepository extends JpaRepository<Visitor, Long>{
	
}
