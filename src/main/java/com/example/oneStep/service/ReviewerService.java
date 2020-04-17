package com.example.oneStep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oneStep.entity.Reviewer;
import com.example.oneStep.repository.ReviewerRepository;

@Service
public class ReviewerService {
	
	@Autowired
	private ReviewerRepository repo;

	public List<Reviewer> getAllData() {
		List<Reviewer>  r = repo.findAll();
		return r;
	}
	
}
