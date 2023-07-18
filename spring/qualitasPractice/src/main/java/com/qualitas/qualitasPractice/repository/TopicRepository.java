package com.qualitas.qualitasPractice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.qualitas.qualitasPractice.model.Topic;

public interface TopicRepository extends JpaRepository<Topic, String>{
	
	//jpql
		@Query("select p from Topic p  where "+
				" p.name like concat('%', :query, '%')"+
				" OR p.description like concat('%', :query, '%')")
		List<Topic> searchTopic(String query);
		
		
//		native sql query
		@Query(value = "select * from topic p  where "+
				"p.name like concat('%', :query, '%')"+
				"OR p.description like concat('%', :query, '%')", nativeQuery=true)
		List<Topic> searchTopicBySql(String query);

}
