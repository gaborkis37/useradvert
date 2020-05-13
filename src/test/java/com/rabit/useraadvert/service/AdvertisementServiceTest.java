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

import com.rabit.useraadvert.domain.Advertisement;
import com.rabit.useraadvert.domain.User;
import com.rabit.useraadvert.repository.AdvertisementRepository;
import com.rabit.useraadvert.serviceImpl.AdvertisementServiceImpl;

@ExtendWith(SpringExtension.class)
public class AdvertisementServiceTest {
	User user = new User("TestUser1");
	User user2 = new User("TestUser2");
	Advertisement advert = new Advertisement("TestAdvert1", user);
	Advertisement advert2 = new Advertisement("TestAdvert2", user);
	Advertisement advert3 = new Advertisement("TestAdvert3", user2);

	@InjectMocks
	AdvertisementServiceImpl advertService;

	@Mock
	AdvertisementRepository advertRepo;

	@Test
	public void testFindAllWithMultipleAdverts() {
		when(advertRepo.findAll()).thenReturn(Arrays.asList(advert, advert2, advert3));

		List<Advertisement> advert = advertService.findAll();

		assertEquals(3, advert.size());
		assertEquals("TestAdvert1", advert.get(0).getTitle());
		assertEquals("TestUser1", advert.get(0).getUser().getName());
		assertEquals("TestAdvert2", advert.get(1).getTitle());
		assertEquals("TestUser1", advert.get(1).getUser().getName());
		assertEquals("TestAdvert3", advert.get(2).getTitle());
		assertEquals("TestUser2", advert.get(2).getUser().getName());
	}

	@Test
	public void testFindAllWithNoAdverts() {
		when(advertRepo.findAll()).thenReturn(Arrays.asList());

		List<Advertisement> advert = advertService.findAll();

		assertEquals(0, advert.size());

	}
	
	@Test
	public void testSave() {
		when(advertRepo.save(advert)).thenReturn(advert);
		
		Advertisement testAdvert = advertService.save(advert);
		
		assertEquals("TestAdvert1", testAdvert.getTitle());
		assertEquals("TestUser1", testAdvert.getUser().getName());
	}
}
