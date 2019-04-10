package com.example.homework.SpringFilingApplication;

import com.example.homework.SpringFilingApplication.models.User;
import com.example.homework.SpringFilingApplication.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringFilingApplicationTests {
	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateUser() {
		User user1 = new User("Louise");
		userRepository.save(user1);
	}


}
