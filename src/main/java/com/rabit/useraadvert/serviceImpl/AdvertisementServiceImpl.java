package com.rabit.useraadvert.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rabit.useraadvert.domain.Advertisement;
import com.rabit.useraadvert.repository.AdvertisementRepository;
import com.rabit.useraadvert.service.AdvertisementService;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {

	private final AdvertisementRepository advertRepo;

	public AdvertisementServiceImpl(AdvertisementRepository advertRepo) {
		super();
		this.advertRepo = advertRepo;
	}
	
	@Override
	public List<Advertisement> findAll() {
		return advertRepo.findAll();
	}
	
	@Override
	public Advertisement save(Advertisement advert) {
		return advertRepo.save(advert);
	}
	
}
