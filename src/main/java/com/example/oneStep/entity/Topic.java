package com.example.oneStep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "topic")
public class Topic {
	
	@Id
	@GeneratedValue
	@Column(name = "topic_id")
	private int topicId;
	
	@Column(name = "topic_name")
	private String topicName;
	
	@Column(name = "description")
	private String desc;

	public Topic(int topicId, String topicName, String desc) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.desc = desc;
	}

	public Topic() {
		super();
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
