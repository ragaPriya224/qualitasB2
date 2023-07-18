package com.qualitas.qualitasPractice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.qualitas.qualitasPractice.model.Topic;
import com.qualitas.qualitasPractice.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		List<Topic> dataList = new ArrayList<>();
		 topicRepository.findAll().forEach(dataList::add);
		 return dataList;
	}

	public Topic getTopic(String topicId) {
		// TODO Auto-generated method stub
		return topicRepository.findById(topicId).get();
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topicRepository.deleteById(id);
	}

	public void addTopic(Topic topicData) {
		// TODO Auto-generated method stub
		topicRepository.save(topicData);
	}

	public void updateTopic(Topic topic) {
		topicRepository.save(topic);
		//save for both add and update..
//		it checks id present or not
//		id present -> update record
//		id not present -> add record
	}
	public Page<Topic> getProductsByPage(Optional<Integer> pageParam, Optional<String> sortBy) {
//		int page, int size, Direction direction, String... properties
		return	topicRepository.findAll(
				PageRequest.of(
						pageParam.orElse(0),  //page number
						5, //3 records per page
				Direction.DESC, //Direction
				sortBy.orElse("id"))); // sort based on column
	}
	
	public List<Topic> searchProducts(String query) {
		List<Topic> output = topicRepository.searchTopic(query);
		System.out.println("output"+output);
		return output;
	}

}
