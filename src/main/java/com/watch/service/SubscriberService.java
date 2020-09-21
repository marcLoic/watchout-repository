package com.watch.service;

import java.util.List;
import java.util.Optional;

import com.watch.entities.Subscriber;

public interface SubscriberService {

	Optional<Subscriber> findById(Long id);
	
	List<Subscriber> listSubscribers();
	
	Subscriber addSubscriber(Subscriber subscriber);
	
	void deleteSubscriber(Long id);
	
	Subscriber updateSubscriber(Subscriber subscriber);
	
}
