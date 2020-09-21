package com.watch.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watch.entities.Subscriber;
import com.watch.repository.SubscriberRepository;
import com.watch.service.SubscriberService;

@Service
public class SubscriberImplementation implements SubscriberService{
	
	
	public SubscriberRepository subscriberRepository;
	
	@Autowired
	public SubscriberImplementation(SubscriberRepository subscriberRepository) {
		super();
		this.subscriberRepository = subscriberRepository;
	}

	@Override
	public List<Subscriber> listSubscribers() {
		return subscriberRepository.findAll();
	}

	@Override
	public Subscriber addSubscriber(Subscriber subscriber) {
		return subscriberRepository.save(subscriber);
	}

	@Override
	public void deleteSubscriber(Long id) {
		subscriberRepository.deleteById(id);
	}

	@Override
	public Subscriber updateSubscriber(Subscriber subscriber) {
		return subscriberRepository.save(subscriber);
	}

	@Override
	public Optional<Subscriber> findById(Long id) {
		return subscriberRepository.findById(id);
	}

}
