package com.rabit.useraadvert.service;

import java.util.List;

import com.rabit.useraadvert.domain.Advertisement;

public interface AdvertisementService {

	List<Advertisement> findAll();

	Advertisement save(Advertisement advert);

}