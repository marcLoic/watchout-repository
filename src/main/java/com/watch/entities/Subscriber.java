package com.watch.entities;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
@Table(name = "subscriber")
public class Subscriber {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private long subscriberid;

	@Column(name = "pseudo")
	private String pseudo;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "phonecode")
	private String phonecode;
	
	@Column(name = "dateofsubscription")
	private Date dateofsubscription;

	@Column(name = "priseencharge")
	private boolean priseencharge;

	@Column(name = "age")
	private int age;
	
	@OneToMany(mappedBy = "subscriber")
	private List<Operation> operation;
	
	@OneToMany(mappedBy="subscriber")
	private List<Test> test;

	public long getSubscriberid() {
		return subscriberid;
	}

	public void setSubscriberid(long subscriberid) {
		this.subscriberid = subscriberid;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPhonecode() {
		return phonecode;
	}

	public void setPhonecode(String phonecode) {
		this.phonecode = phonecode;
	}

	public Date getDateofsubscription() {
		return dateofsubscription;
	}

	public void setDateofsubscription(Date dateofsubscription) {
		this.dateofsubscription = dateofsubscription;
	}

	public boolean getPriseencharge() {
		return priseencharge;
	}

	public void setPriseencharge(boolean priseencharge) {
		this.priseencharge = priseencharge;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Operation> getOperation() {
		return operation;
	}

	public void setOperation(List<Operation> operation) {
		this.operation = operation;
	}

	//@JsonIgnore
	public List<Test> getTest() {
		return test;
	}

	public void setTest(List<Test> test) {
		this.test = test;
	}
}
