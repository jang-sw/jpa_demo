package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.entity.Userdetail;
import com.example.demo.service.SubjectService;
import com.example.demo.service.UserService;
import com.example.demo.service.UserdetailService;


@RestController
public class Controller {
	@Autowired
	UserService userService;

	@Autowired
	SubjectService subjectService;
	@Autowired
	UserdetailService userdetailService;
	
	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public List<User> userList() {
		return userService.findAll();
	}
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public void saveUser(User user) {
		userService.save(user);
	}
	@RequestMapping(value = "/user", method = RequestMethod.DELETE)
	public void deleteUser(User user) {
		userService.delete(user);
	}
	@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
	public Userdetail userInfo(User user) {
		return userdetailService.findUserInfoByUser(user);
	}
}
