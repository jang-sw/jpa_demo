package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service	
public class UserService {

	@Autowired UserRepository userRepository;
	
	public List<User> findAll(){
		return this.userRepository.findAll();
	}
	public void save(User user) {
		this.userRepository.save(user);
	}
	@Transactional
	public void delete(User user) {
		if(user.getUserId() != 0) {
			this.userRepository.deleteByUserId(user.getUserId());
		}else {
			this.userRepository.deleteByUserName(user.getUserName());
		}
	}
	
	
}
