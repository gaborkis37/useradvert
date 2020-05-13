package com.rabit.useraadvert.service;

import java.util.List;

import com.rabit.useraadvert.domain.Advertisement;
import com.rabit.useraadvert.repository.AdvertisementRepository;

public class AdvertisementServiceImpl {

	private final AdvertisementRepository advertRepo;

	public AdvertisementServiceImpl(AdvertisementRepository advertRepo) {
		super();
		this.advertRepo = advertRepo;
	}
	
	public List<Advertisement> findAll() {
		return advertRepo.findAll();
	}
	
}
