package com.rabit.useraadvert.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.NonNull;

@Entity
public class Advertisement {
	
	@Id
	@GeneratedValue
	private Long Id;
	@NonNull
	private String title;
	@ManyToOne
	private User user;
	
}
