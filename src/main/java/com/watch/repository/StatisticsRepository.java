package com.watch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watch.entities.Statistics;

public interface StatisticsRepository extends JpaRepository<Statistics, Long>{

}
