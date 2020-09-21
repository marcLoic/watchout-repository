package com.watch.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.watch.entities.Subscriber;
import com.watch.repository.SubscriberRepository;
import com.watch.service.SubscriberService;

@RestController
public class SubscriberController {

	
	SubscriberService subscriberService;
	SubscriberRepository subscriberRepository;

	@Autowired
	public SubscriberController(SubscriberService subscriberService) {
		super();
		this.subscriberService = subscriberService;
	}
	
	@GetMapping("/listsubscriber/{subscriberid}")
	public Subscriber findSubscriber(@PathVariable Long subscriberid){
		Optional<Subscriber> subscriberOptional = subscriberService.findById(subscriberid);
		if(subscriberOptional.isPresent()){
		    return subscriberOptional.get();
		}else {
		    return null;
		}
	}
	
	@GetMapping("/listsubscriber")
	public List<Subscriber> listSubscriber(){
		return subscriberService.listSubscribers();
	}
	
	@PostMapping("/addsubscriber")
	public Subscriber addSubscriber(@RequestBody Subscriber subscriber){
		return subscriberService.addSubscriber(subscriber);
	}
	
	@DeleteMapping("/deletesubscriber")
	public void deleteSubscriber(@PathVariable Long id){
		subscriberService.deleteSubscriber(id);;
	}
	
	// this update will manage both updating of information and "prise en charge" 
	@PutMapping("/updatesubscriber")
	public Subscriber updateSubscriber(@RequestBody Subscriber subscriber){
		return subscriberService.updateSubscriber(subscriber);
	}
}
