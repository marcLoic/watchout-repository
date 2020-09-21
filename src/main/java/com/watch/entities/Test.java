package com.watch.entities;

import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Table(name = "test")
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private long testid;

	@Column(name = "probabilityofcontamination")
	private double probabilityofcontamination;

	@Column(name = "dateoftest")
	private Date dateoftest;
	
	@ManyToOne()
	@JoinColumn(name="visitorid")
	private Visitor visitor;
	
	@OneToMany(mappedBy = "test")
	private List<Results> results;
	
	@ManyToOne
	@JoinColumn(name="subscriberid") 
	private Subscriber subscriber;
	
	@ManyToOne
	@JoinColumn(name="locationid") 
	private Location location;
	
	public long getTestid() {
		return testid;
	}

	public void setTestid(long testid) {
		this.testid = testid;
	}

	public double getProbabilityofcontamination() {
		return probabilityofcontamination;
	}

	public void setProbabilityofcontamination(double probabilityofcontamination) {
		this.probabilityofcontamination = probabilityofcontamination;
	}

	public Date getDateoftest() {
		return dateoftest;
	}

	public void setDateoftest(Date dateoftest) {
		this.dateoftest = dateoftest;
	}

	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}
	
	public List<Results> getResults() {
		return results;
	}

	public void setResults(List<Results> results) {
		this.results = results;
	}

	@JsonIgnore
	public Subscriber getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	//@JsonIgnore
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
}
