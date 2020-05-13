package com.rabit.useraadvert.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Advertisement {
	
	@Id
	@GeneratedValue
	private Long Id;
	@NonNull
	private String title;
	@ManyToOne
	@NonNull
	private User user;
	
}
