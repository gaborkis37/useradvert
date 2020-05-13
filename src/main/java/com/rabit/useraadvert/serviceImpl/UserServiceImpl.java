package com.rabit.useraadvert.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rabit.useraadvert.domain.User;
import com.rabit.useraadvert.repository.UserRepository;
import com.rabit.useraadvert.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepo;

	public UserServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}

	@Override
	public User save(User user) {
		return userRepo.save(user);
	}

}
