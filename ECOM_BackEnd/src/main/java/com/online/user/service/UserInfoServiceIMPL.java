package com.online.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.entity.User;
import com.online.user.repository.UserInfoRepo;

@Service
public class UserInfoServiceIMPL implements UserInfoService {

	@Autowired
	private UserInfoRepo userInfoRepo;
	@Override
	public boolean isAddUser(User user) {
		User u=userInfoRepo.save(user);
		if(u!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	@Override
	public List<User> isShowUSer() {
		
		return userInfoRepo.findAll();
	}

}
