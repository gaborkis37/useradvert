package com.rabit.useraadvert.service;

import java.util.List;

import com.rabit.useraadvert.domain.User;
import com.rabit.useraadvert.repository.UserRepository;

public class UserServiceImpl {

	private final UserRepository userRepo;

	public UserServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}
	
	
	public List<User> findAll() {
		return userRepo.findAll();
	}
	
}
