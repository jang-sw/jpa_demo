package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.entity.Userdetail;
import com.example.demo.repository.UserdetailRepository;

@Service	
public class UserdetailService {

	@Autowired UserdetailRepository userdetailRepository;
	
	public Userdetail findUserInfoByUser(User user){
		return this.userdetailRepository.findByUser(user);
	}
	
}
