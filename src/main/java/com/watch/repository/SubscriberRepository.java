package com.watch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watch.entities.Subscriber;

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {

}
