package com.rabit.useraadvert.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.rabit.useraadvert.domain.User;
import com.rabit.useraadvert.repository.UserRepository;
import com.rabit.useraadvert.serviceImpl.UserServiceImpl;

@ExtendWith(SpringExtension.class)
public class UserServiceTest {
	User user = new User("TestUser1");
	User user2 = new User("TestUser2");

	@InjectMocks
	private UserServiceImpl userService;
	
	@Mock
	private UserRepository userRepo;
	
	@Test
	public void testFindAllWithMultipleUsers() {
		when(userRepo.findAll()).thenReturn(Arrays.asList(user,user2));
		
		List<User> users = userService.findAll();
		assertEquals(2, users.size());
		assertEquals("TestUser1", users.get(0).getName());
		assertEquals("TestUser2",users.get(1).getName());
	}
	
	@Test
	public void testFindAllWithNoUsers() {
		when(userRepo.findAll()).thenReturn(Arrays.asList());
		
		List<User> users = userService.findAll();
		assertEquals(0, users.size());
	}
	
	@Test
	public void testSaveUser() {
		when(userRepo.save(user)).thenReturn(user);
		
		User testUser = userService.save(user);
		
		assertEquals("TestUser1", testUser.getName());
	}
	
	
}
