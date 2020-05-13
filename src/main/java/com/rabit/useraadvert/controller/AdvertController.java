package com.rabit.useraadvert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rabit.useraadvert.service.AdvertisementService;

@Controller
public class AdvertController {

	private final AdvertisementService advertService;

	public AdvertController(AdvertisementService advertService) {
		super();
		this.advertService = advertService;
	}

	@GetMapping("/adverts/advertslist")
	public String adverts(Model model) {
		model.addAttribute("advertList",advertService.findAll());
		return "adverts/advertslist";
	}

}
