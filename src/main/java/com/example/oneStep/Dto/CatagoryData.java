package com.example.oneStep.Dto;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class CatagoryData {
	
	@Id
	@GeneratedValue
	private int title_id;
	private String title_name;
	private int Topic_topic_id;
	private String current_status;
	private String title_desc;
	private String created_by;
	private String reviewrs_ntid;
	
	
	public CatagoryData() {
		super();
	}


	public CatagoryData(int title_id, String title_name, int topic_topic_id, String current_status, String title_desc,
			String created_by, String reviewrs_ntid) {
		super();
		this.title_id = title_id;
		this.title_name = title_name;
		Topic_topic_id = topic_topic_id;
		this.current_status = current_status;
		this.title_desc = title_desc;
		this.created_by = created_by;
		this.reviewrs_ntid = reviewrs_ntid;
	}


	public int getTitle_id() {
		return title_id;
	}


	public void setTitle_id(int title_id) {
		this.title_id = title_id;
	}


	public String getTitle_name() {
		return title_name;
	}


	public void setTitle_name(String title_name) {
		this.title_name = title_name;
	}


	public int getTopic_topic_id() {
		return Topic_topic_id;
	}


	public void setTopic_topic_id(int topic_topic_id) {
		Topic_topic_id = topic_topic_id;
	}


	public String isCurrent_status() {
		return current_status;
	}


	public void setCurrent_status(String current_status) {
		this.current_status = current_status;
	}


	public String getTitle_desc() {
		return title_desc;
	}


	public void setTitle_desc(String title_desc) {
		this.title_desc = title_desc;
	}


	public String getCreated_by() {
		return created_by;
	}


	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}


	public String getReviewrs_ntid() {
		return reviewrs_ntid;
	}


	public void setReviewrs_ntid(String reviewrs_ntid) {
		this.reviewrs_ntid = reviewrs_ntid;
	}
	
	
	
	
	

}
