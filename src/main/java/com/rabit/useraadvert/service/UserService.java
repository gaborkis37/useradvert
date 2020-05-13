package com.rabit.useraadvert.service;

import java.util.List;

import com.rabit.useraadvert.domain.User;

public interface UserService {

	List<User> findAll();

	User save(User user);

}