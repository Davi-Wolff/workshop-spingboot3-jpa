package com.example.demo.config;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRpository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Bob Brown","bob@gmail.com","8888888", "789456");
		User u2 = new User(null, "Alex Green","alex@gmail.com","7777777", "6548951");
		
		userRpository.saveAll(Arrays.asList(u1,u2));
	}
}
