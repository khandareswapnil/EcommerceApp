package com.online.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.entity.User;
import com.online.repository.UserRepo;

@Service("userService")
public class UserRegistrationIMPL implements UserRegistration {

	@Autowired
	private UserRepo userRepo;
	@Override
	public boolean isUserAdd(User user) {
		
		User u= userRepo.save(user);
		if(u!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
