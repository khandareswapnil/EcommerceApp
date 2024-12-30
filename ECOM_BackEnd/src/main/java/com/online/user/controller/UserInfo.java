package com.online.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.entity.User;
import com.online.user.service.UserInfoService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserInfo {
	@Autowired
	private UserInfoService userInfo;
	
	private List list;
	
	@PostMapping("/isAddUser")
	public String isAddUSer(@RequestBody User user)
	{
		boolean b=userInfo.isAddUser(user);
		if(b)
		{
			return "sucess";
		}
		else
		{
			return "unsucess";
		}
	}
	
	@GetMapping("/isShowUser")
	public List<User> isShowUser()
	{
		return list=userInfo.isShowUSer();	
	}
	
}
