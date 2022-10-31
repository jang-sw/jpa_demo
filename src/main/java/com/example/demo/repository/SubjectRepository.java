package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Subject;
import com.example.demo.entity.User;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>  {

	@EntityGraph(attributePaths = {"user"}, type = EntityGraphType.FETCH)
	public List<Subject> findAll();
	@EntityGraph(attributePaths = {"user"}, type = EntityGraphType.FETCH)
	public List<Subject> findByUser(User user);
}
