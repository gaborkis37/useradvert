package com.rabit.useraadvert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabit.useraadvert.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
