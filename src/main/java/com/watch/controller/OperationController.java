package com.watch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.watch.entities.Operation;
import com.watch.service.OperationService;

@RestController
public class OperationController {

	
	OperationService operationService;

	@Autowired
	public OperationController(OperationService operationService) {
		super();
		this.operationService = operationService;
	}
	
	@GetMapping("/listoperation")
	public List<Operation> listAdmin(){
		return operationService.listOperations();
	}
	
	@PostMapping("/addoperation")
	public Operation addOperation(@RequestBody Operation operation){
		return operationService.addOperation(operation);
	}
	
	@DeleteMapping("/deleteoperation")
	public void deleteOperation(@PathVariable Long id){
		operationService.deleteOperation(id);;
	}
	
	@PutMapping("/updateoperation")
	public Operation updateOperation(@RequestBody Operation operation){
		return operationService.updateOperation(operation);
	}
}
