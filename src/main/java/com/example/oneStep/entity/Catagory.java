package com.example.oneStep.entity;

//import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "catagory")
public class Catagory {
	
	@Id 
	@GeneratedValue
	@Column(name = "title_id")
	private int titleId;
	
	
	@Column(name = "title_name")
	private String titleName;
	
	@Column(name = "catagorystatus")
	private String catagorystatus;
	
	
	@Column(name = "title_desc")
	private String titleDesc;
	
	@Column(name = "created_by")
	private String createdBy;
	
	
	
	
//	@Column(name = "created_date")
//	private Date createdDate;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date",  updatable=false)
	@ColumnDefault("CURRENT_TIMESTAMP")
	private Date createdDate;
	
	//@Column(name = "last_updated")
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated")
	@ColumnDefault("CURRENT_TIMESTAMP")
	private Date lastUpdated;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Topic_topic_id")
	private Topic topic;
	
	
	@JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "reviewrs_ntid")
	private Reviewer reviewers;


	public Catagory() {
		super();
	}


	public Catagory(int titleId, String titleName, String catagorystatus, String titleDesc, String createdBy,
			Date createdDate, Date lastUpdated, Topic topic, Reviewer reviewers) {
		super();
		this.titleId = titleId;
		this.titleName = titleName;
		this.catagorystatus = catagorystatus;
		this.titleDesc = titleDesc;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdated = lastUpdated;
		this.topic = topic;
		this.reviewers = reviewers;
	}


	public int getTitleId() {
		return titleId;
	}


	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}


	public String getTitleName() {
		return titleName;
	}


	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}


	public String getCatagorystatus() {
		return catagorystatus;
	}


	public void setCatagorystatus(String catagorystatus) {
		this.catagorystatus = catagorystatus;
	}


	public String getTitleDesc() {
		return titleDesc;
	}


	public void setTitleDesc(String titleDesc) {
		this.titleDesc = titleDesc;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public Date getLastUpdated() {
		return lastUpdated;
	}


	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}


	public Topic getTopic() {
		return topic;
	}


	public void setTopic(Topic topic) {
		this.topic = topic;
	}


	public Reviewer getReviewers() {
		return reviewers;
	}


	public void setReviewers(Reviewer reviewers) {
		this.reviewers = reviewers;
	}


	
	
	
}
