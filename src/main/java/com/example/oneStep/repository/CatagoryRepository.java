 package com.example.oneStep.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.oneStep.Dto.TopicCtagaoryDto;
import com.example.oneStep.entity.Catagory;



@Repository
public interface CatagoryRepository extends CrudRepository<Catagory , Integer>{
	
	public List<Catagory> findByReviewersId(String id);
	public List<Catagory> findByCatagorystatusAndReviewersId(String currentStatus , String Ntid);
	
	public List<Catagory> findByCatagorystatusAndTopicTopicId(String currentStatus , int id);

	public List<Catagory> findTop5ByCatagorystatusOrderByCreatedDateDesc(String currentStatus);
	
	
	@Query("SELECT new com.example.oneStep.Dto.TopicCtagaoryDto(c.titleId, c.topic.topicId, c.topic.topicName, c.titleName , c.catagorystatus , c.titleDesc , c.createdBy , c.createdDate , c.lastUpdated , c.reviewers.id) FROM Catagory c ,Topic t where c.topic = t")
	public List<TopicCtagaoryDto> join();
	
	@Query("SELECT new com.example.oneStep.Dto.TopicCtagaoryDto(c.titleId, c.topic.topicId, c.topic.topicName, c.titleName , c.catagorystatus , c.titleDesc , c.createdBy , c.createdDate , c.lastUpdated , c.reviewers.id) FROM Catagory c ,Topic t where c.topic = t AND c.topic.topicId = :topicId AND c.catagorystatus = :currentStatus")
	public List<TopicCtagaoryDto> join1(String currentStatus, int topicId);
}
