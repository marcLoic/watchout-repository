package com.watch.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "operation")
public class Operation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private long operationid;

	@Column(name = "actionperformed")
	private String actionperformed;

	@Column(name = "target")
	private String target;

	@Column(name = "dateofoperation")
	private Date dateofoperation;
	
	@ManyToOne
	@JoinColumn(name="adminid") 
	private Admin admin;
	
	@ManyToOne
	@JoinColumn(name="superadminid") 
	private SuperAdmin superadmin;
	
	@ManyToOne
	@JoinColumn(name="subscriberid") 
	private Subscriber subscriber;

	public long getOperationid() {
		return operationid;
	}

	public void setOperationid(long operationid) {
		this.operationid = operationid;
	}

	public String getActionperformed() {
		return actionperformed;
	}

	public void setActionperformed(String actionperformed) {
		this.actionperformed = actionperformed;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Date getDateofoperation() {
		return dateofoperation;
	}

	public void setDateofoperation(Date dateofoperation) {
		this.dateofoperation = dateofoperation;
	}

	@JsonIgnore
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public SuperAdmin getSuperadmin() {
		return superadmin;
	}

	public void setSuperadmin(SuperAdmin superadmin) {
		this.superadmin = superadmin;
	}

	@JsonIgnore
	public Subscriber getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

}
