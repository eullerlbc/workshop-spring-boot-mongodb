package com.eullerboer.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.eullerboer.workshopmongo.domain.User;
import com.eullerboer.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();

		User usr1 = new User(null, "Euller Boer", "euller@gmail.com");
		User usr2 = new User(null, "Ellen Boer", "ellen@gmail.com");
		User usr3 = new User(null, "Nelson Constantino", "nelson@gmail.com");

		userRepository.saveAll(Arrays.asList(usr1, usr2, usr3));
	}

}
