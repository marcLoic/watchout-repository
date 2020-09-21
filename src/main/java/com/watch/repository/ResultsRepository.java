package com.watch.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watch.entities.Question;
import com.watch.entities.Results;
import com.watch.entities.Test;

public interface ResultsRepository extends JpaRepository<Results, Long>{
		
}
