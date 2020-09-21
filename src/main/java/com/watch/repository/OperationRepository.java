package com.watch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watch.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long>{

}
