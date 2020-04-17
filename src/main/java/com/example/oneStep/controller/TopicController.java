package com.example.oneStep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.oneStep.entity.Topic;
import com.example.oneStep.service.TopicService;

@CrossOrigin
@RestController
public class TopicController {
	
	@Autowired
	private TopicService ser;
		
	@RequestMapping(value = "/AllTopic" , method = RequestMethod.GET)
	public List<Topic> getAllTopic() {
		return this.ser.getAllTopic();
	}
	
	@RequestMapping(value = "/postTopic" , method = RequestMethod.POST)
	public int postTopic(@RequestBody Topic c) {
		this.ser.postTopic(c);
		return 1;
	}
	
	@RequestMapping(value = "/deleteTopic/{id}" , method = RequestMethod.DELETE)
	public int deleteTopic(@PathVariable int id) {
		this.ser.deleteTopic(id);
		return 1;
	}
	
}
