package com.example.demo.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;
import com.example.demo.entity.Userdetail;

@Repository
public interface UserdetailRepository extends JpaRepository<Userdetail, Long>  {
	
	@EntityGraph(attributePaths = {"user"}, type = EntityGraphType.FETCH)
	public Userdetail findByUser(User user);

}
