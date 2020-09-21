package com.watch.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watch.entities.Visitor;
import com.watch.repository.VisitorRepository;
import com.watch.service.VisitorService;

@Service
public class VIsitorImplementation implements VisitorService {

	
	VisitorRepository visitorRepository;
	
	@Autowired
	public VIsitorImplementation(VisitorRepository visitorRepository) {
		super();
		this.visitorRepository = visitorRepository;
	}

	@Override
	public List<Visitor> listVisitors() {
		return visitorRepository.findAll();
	}

	@Override
	public Visitor addVisitors(Visitor visitor) {
		return visitorRepository.save(visitor);
	}

	@Override
	public void deleteVisitors(Long id) {
		visitorRepository.deleteById(id);
	}

	@Override
	public Visitor updateVisitors(Visitor visitor) {
		return visitorRepository.save(visitor);
	}

}
