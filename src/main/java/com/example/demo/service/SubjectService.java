package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Subject;
import com.example.demo.entity.User;
import com.example.demo.repository.SubjectRepository;

@Service	
public class SubjectService {

	@Autowired SubjectRepository subjectRepository; 
	
	public List<Subject> findAll(){
		return this.subjectRepository.findAll();
	}
	public List<Subject> findByUser(User user){
		return this.subjectRepository.findByUser(user);
	}
}
