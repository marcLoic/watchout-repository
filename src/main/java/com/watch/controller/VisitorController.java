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

import com.watch.entities.Visitor;
import com.watch.service.VisitorService;

@RestController
public class VisitorController {

	
	VisitorService visitorService;
	
	@Autowired
	public VisitorController(VisitorService visitorService) {
		super();
		this.visitorService = visitorService;
	}
	
	@GetMapping("/listvisitor")
	public List<Visitor> listTest(){
		return visitorService.listVisitors();
	}
	
	@PostMapping("/addvisitor")
	public Visitor addVisitors(@RequestBody Visitor visitor){
		return visitorService.addVisitors(visitor);
	}
	
	@DeleteMapping("/deletevisitor")
	public void deleteVisitors(@PathVariable Long id){
		visitorService.deleteVisitors(id);;
	}
	
	@PutMapping("/updatevisitor")
	public Visitor updateVisitors(@RequestBody Visitor visitor){
		return visitorService.updateVisitors(visitor);
	}
}
