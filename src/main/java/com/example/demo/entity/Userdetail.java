package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Userdetail {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	int detailId;
	
	String address;
	String email;
	
	@OneToOne(targetEntity = User.class, fetch = FetchType.LAZY)
	@JoinColumn(name  = "user_id") 
	User user;
}
