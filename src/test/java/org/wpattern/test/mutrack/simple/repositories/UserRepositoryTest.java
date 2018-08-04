package org.wpattern.test.mutrack.simple.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.mutrack.simple.user.UserEntity;
import org.wpattern.mutrack.simple.user.UserRepository;
import org.wpattern.test.mutrack.simple.utils.AbstractTest;


public class UserRepositoryTest extends AbstractTest {
	
	private static final Logger LOGGER = Logger.getLogger(UserRepositoryTest.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testFindAll() {
		List<UserEntity> users = this.userRepository.findAll();
		
		LOGGER.info(users);
	}
	
//	@Test
//	public void testFindOne() {
//		UserEntity user = this.userRepository.findOne(1l);
//		
//		LOGGER.info(user);
//	}
//	
//	@Test
//	public void testFindByEmail() {
//		UserEntity user = this.userRepository.findByEmail("user@user.com");
//		
//		LOGGER.info(user);
//	}
//	
//	@Test
//	public void testFindByEmailOrName() {
//		List<UserEntity> users = this.userRepository.findByEmailOrName("user@user.com", "Admin");
//		
//		LOGGER.info(users);
//	}
	

}
