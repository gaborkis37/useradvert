package com.rabit.useraadvert.dbloader;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rabit.useraadvert.domain.Advertisement;
import com.rabit.useraadvert.domain.User;
import com.rabit.useraadvert.service.AdvertisementService;
import com.rabit.useraadvert.service.UserService;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final UserService userService;
	private final AdvertisementService advertService;

	public DatabaseLoader(UserService userService, AdvertisementService advertService) {
		super();
		this.userService = userService;
		this.advertService = advertService;
	}

	@Override
	public void run(String... args) throws Exception {
		List<User> users = new ArrayList<>();
		User matt = new User("Matt");
		User sheldon = new User("Sheldon");
		User leonard = new User("Leonard");
		User howard = new User("Howard");
		User penny = new User("Penny");
		users.add(matt);
		users.add(sheldon);
		users.add(leonard);
		users.add(howard);
		users.add(penny);
		
		List<Advertisement> adverts = new ArrayList<>();
		adverts.add(new Advertisement("This is an advert for a really great website", matt));
		adverts.add(new Advertisement("This is the second advert", howard));
		adverts.add(new Advertisement("This is and advert for a great product", sheldon));
		adverts.add(new Advertisement("This is an advert for a great food", sheldon));
		adverts.add(new Advertisement("This is an advert for a brilliant restaurant", leonard));
		adverts.add(new Advertisement("This is an advert for a really great concert", leonard));
		adverts.add(new Advertisement("This is an advert for an awesome party", leonard));
		adverts.add(new Advertisement("This is an advert for a movie", penny));

		for (User user : users) {
			userService.save(user);
		}
		
		for(Advertisement advert : adverts)   {
			advertService.save(advert);
		}
	}

}
