package com.example.oneStep.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oneStep.Dto.CatagoryData;
import com.example.oneStep.Dto.TopicCtagaoryDto;
import com.example.oneStep.entity.Catagory;
import com.example.oneStep.entity.Reviewer;
import com.example.oneStep.entity.Topic;

import com.example.oneStep.repository.CatagoryRepository;
import com.example.oneStep.repository.ReviewerRepository;


@Service
public class CatagoryService {

	@Autowired
	private CatagoryRepository repo;
	
	@Autowired
	private ReviewerRepository rRepo;
	
	
	public List<Catagory> getAllTitleName(String Ntid){
		List<Catagory> catagory = repo.findByReviewersId(Ntid);
		return catagory;
	}

	public List<Catagory> getAllCatagoryOnCurrentStatusAndId(String currentStatus, String id) {
		return repo.findByCatagorystatusAndReviewersId(currentStatus, id);
	}

	public List<Catagory> getAll(String currentStatus) {
		return repo.findTop5ByCatagorystatusOrderByCreatedDateDesc(currentStatus);
	}

	public List<TopicCtagaoryDto> getInnerJoin(){
		return repo.join();
	}
	
	
	public List<TopicCtagaoryDto> getInnerJoinByTopicId(String currentStatus, int topicId){
		return repo.join1(currentStatus , topicId);
	}

	public Optional<Catagory> getCatagoryById(int id) {
		
		return this.repo.findById(id);
	}

	public int catagoryDeleteById(int id) {
		this.repo.deleteById(id);
		return 1;
	}

	public List<TopicCtagaoryDto> getCatagoryByTopicId(String currentStatus, int topicId) {
		return this.repo.join1(currentStatus , topicId);
	}

	public void postCatagory(Catagory d) {
		
		this.repo.save(d);
		//return 1;
	}


	
	
}
