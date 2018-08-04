package org.wpattern.test.mutrack.simple.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.mutrack.simple.userpermission.UserPermissionEntity;
import org.wpattern.mutrack.simple.userpermission.UserPermissionKey;
import org.wpattern.mutrack.simple.userpermission.UserPermissionRepository;
import org.wpattern.test.mutrack.simple.utils.AbstractTest;

public class UserPermissionRepositoryTest extends AbstractTest {
	
private static final Logger LOGGER = Logger.getLogger(UserPermissionRepositoryTest.class);
	
	@Autowired
	private UserPermissionRepository userPermissionRepository;
	
	@Test
	public void testFindAll() {
		List<UserPermissionEntity> userPermissions = this.userPermissionRepository.findAll();
		
		LOGGER.info(userPermissions);
	}

	/*
	@Test
    public void testInsertUserPermission() {
    	UserPermissionEntity userPermissionEntity = new UserPermissionEntity();
    	UserPermissionKey userPermissionKey = new UserPermissionKey();
    	userPermissionKey.setUserId(99l);
    	userPermissionKey.setPermissionId(99l);
    	userPermissionEntity.setId(userPermissionKey); 

    	userPermissionRepository.save(userPermissionEntity);
    	
    	LOGGER.info(userPermissionEntity);
    }*/
}
