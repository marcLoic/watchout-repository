package com.watch.service;

import java.util.List;

import com.watch.entities.Operation;

public interface OperationService {

	List<Operation> listOperations();
	
	Operation addOperation(Operation operation);
	
	void deleteOperation(Long id);
	
	Operation updateOperation(Operation operation);
}
