package com.example.oneStep.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.oneStep.Dto.TopicCtagaoryDto;
import com.example.oneStep.entity.Catagory;
import com.example.oneStep.entity.Reviewer;
import com.example.oneStep.entity.Topic;
import com.example.oneStep.service.CatagoryService;

@CrossOrigin
@RestController
public class CatagoryController {
	
	@Autowired
	private CatagoryService ser;
	
	@RequestMapping("/reviewer/{id}")
	public List<Catagory> getAllCatagoryByID(@PathVariable String id){
		return ser.getAllTitleName(id);
	}
	
	@GetMapping("/reviewer/{currentStatus}/{id}")
	public List<Catagory> getAllCatagoryOnCurrentStatusAndId(@PathVariable("currentStatus") String currentStatus , @PathVariable("id") String id){
		return ser.getAllCatagoryOnCurrentStatusAndId(currentStatus , id);
		
	}
	
	
	@GetMapping("/recentlyReviewed/{currentStatus}")
	public List<Catagory> getAll(@PathVariable String currentStatus){
		return ser.getAll(currentStatus);
	}
	
	
	@GetMapping("/topic/catagory")
	public List<TopicCtagaoryDto> getInnerJoin(){
		return ser.getInnerJoin();
	}
	
	@GetMapping("/topic/catagory/{topicId}")
	public List<TopicCtagaoryDto> getInnerJoinByTopicId(@PathVariable("currentStatus") String currentStatus , @PathVariable("id") int topicId){
		System.out.print(topicId);
		return ser.getInnerJoinByTopicId(currentStatus , topicId);
	}
	
	
	@GetMapping("/CatagoryById/{id}")
	public Optional<Catagory> getCatagoryById(@PathVariable int id) {
		return this.ser.getCatagoryById(id);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/CatagoryDeleteById/{id}" , method = RequestMethod.DELETE)
	public int catagoryDeleteById(@PathVariable int id) {
		return this.ser.catagoryDeleteById(id);
	}
	
	@RequestMapping(value = "/catagoryByTopic/{currentStatus}/{id}" , method = RequestMethod.GET)
	public List<TopicCtagaoryDto> getCatagoryByTopicId(@PathVariable("currentStatus") String currentStatus , @PathVariable("id") int id) {
		return this.ser.getCatagoryByTopicId(currentStatus , id);
	}
	
	@RequestMapping(value = "/catagory/{topicId}/{ntid}" , method = RequestMethod.POST)
	public void postCatagory(@RequestBody Catagory d  , @PathVariable("topicId") int topicid , @PathVariable("ntid") String ntid)  {
		System.out.print(d);
		d.setReviewers(new Reviewer(ntid , "" ));
		d.setTopic(new Topic(topicid , "" , ""));
		
		this.ser.postCatagory(d);
	}
	
}
