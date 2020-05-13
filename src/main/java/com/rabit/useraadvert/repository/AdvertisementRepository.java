package com.rabit.useraadvert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabit.useraadvert.domain.Advertisement;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {

}
