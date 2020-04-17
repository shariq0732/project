package com.example.oneStep.Dto;

//import java.time.LocalDateTime;
import java.util.Date;

public class TopicCtagaoryDto {
	
	private int titleId;
	private int topicId;
	private String topicName;
	private String titleName;
	private String catagorystatus;
	private String titleDesc;
	private String createdBy;
	private Date createdDate;
	private Date lastUpdated;
	private String reviewrsNtid;
	
	public TopicCtagaoryDto() {
		super();
	}

	public TopicCtagaoryDto(int titleId, int topicId, String topicName, String titleName, String catagorystatus,
			String titleDesc, String createdBy, Date createdDate, Date lastUpdated, String reviewrsNtid) {
		super();
		this.titleId = titleId;
		this.topicId = topicId;
		this.topicName = topicName;
		this.titleName = titleName;
		this.catagorystatus = catagorystatus;
		this.titleDesc = titleDesc;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdated = lastUpdated;
		this.reviewrsNtid = reviewrsNtid;
	}

	public int getTitleId() {
		return titleId;
	}

	public void setTitleId(int titleId) {
		this.titleId = titleId;
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

	public String getReviewrsNtid() {
		return reviewrsNtid;
	}

	public void setReviewrsNtid(String reviewrsNtid) {
		this.reviewrsNtid = reviewrsNtid;
	}
	
	
	
	
	
	
}
