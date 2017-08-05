package com.priest.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue
	private String title;
	private String time;
	private String diretor;
	private String actor;
	private String amount;
	private String redate;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getRedate() {
		return redate;
	}

	public void setRedate(String redate) {
		this.redate = redate;
	}

	public Movie() {
		super();
	}

	public Movie(String title, String time, String diretor, String actor, String amount, String redate) {
		super();
		this.title = title;
		this.time = time;
		this.diretor = diretor;
		this.actor = actor;
		this.amount = amount;
		this.redate = redate;
	}
}
