package com.example.oneStep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.oneStep.entity.Reviewer;
import com.example.oneStep.service.ReviewerService;

@CrossOrigin
@RestController
public class ReviewerController {
	
	@Autowired
	private ReviewerService ser;
	
	@RequestMapping(value = "/allReviewer" , method = RequestMethod.GET)
	public List<Reviewer> getAllData(){
		System.out.print("ssbjfsd");
		return ser.getAllData();
	}
}
