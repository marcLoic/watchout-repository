package com.watch.service;

import java.util.List;

import com.watch.entities.Visitor;

public interface VisitorService {

	List<Visitor> listVisitors();
	
	Visitor addVisitors(Visitor visitor);
	
	void deleteVisitors(Long id);
	
	Visitor updateVisitors(Visitor visitor);
}
