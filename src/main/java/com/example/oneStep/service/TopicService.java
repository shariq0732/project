package com.example.oneStep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oneStep.entity.Topic;
import com.example.oneStep.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topic;
	

	public List<Topic> getAllTopic() {
		return this.topic.findAll();
	}


	public int postTopic(Topic c) {
		this.topic.save(c);
		return 1;
	}


	public int deleteTopic(int id) {
		this.topic.deleteById(id);
		return 1;
	}
}
