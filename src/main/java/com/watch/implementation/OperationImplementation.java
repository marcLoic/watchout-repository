package com.watch.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watch.entities.Operation;
import com.watch.repository.OperationRepository;
import com.watch.service.OperationService;

@Service
public class OperationImplementation implements OperationService {

	
	OperationRepository operationRepository;
	
	@Autowired
	public OperationImplementation(OperationRepository operationRepository) {
		super();
		this.operationRepository = operationRepository;
	}

	@Override
	public List<Operation> listOperations() {
		return operationRepository.findAll();
	}

	@Override
	public Operation addOperation(Operation operation) {
		return operationRepository.save(operation);
	}

	@Override
	public void deleteOperation(Long id) {
		operationRepository.deleteById(id);
	}

	@Override
	public Operation updateOperation(Operation operation) {
		return operationRepository.save(operation);
	}

}
