package com.qualitas.qualitasPractice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

}
