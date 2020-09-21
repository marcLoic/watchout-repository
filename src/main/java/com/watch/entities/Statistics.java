package com.watch.entities;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "statistics")
public class Statistics {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private long statsid;

	@Column(name = "totalcases")
	private int totalcases;

	@Column(name = "deaths")
	private int deaths;

	@Column(name = "recovered")
	private int recovered;
	
	@Column(name = "dateofstats")
	private Date dateofstats;

	@Column(name = "newcases")
	private int newcases;
	
	@ManyToOne
	@JoinColumn(name="adminid")
	private Admin admin;
	
	public long getStatsid() {
		return statsid;
	}

	public void setStatsid(long statsid) {
		this.statsid = statsid;
	}

	public int getTotalcases() {
		return totalcases;
	}

	public void setTotalcases(int totalcases) {
		this.totalcases = totalcases;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getRecovered() {
		return recovered;
	}

	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}

	public Date getDateofstats() {
		return dateofstats;
	}

	public void setDateofstats(Date dateofstats) {
		this.dateofstats = dateofstats;
	}

	public int getNewcases() {
		return newcases;
	}

	public void setNewcases(int newcases) {
		this.newcases = newcases;
	}

	@JsonIgnore
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
}
