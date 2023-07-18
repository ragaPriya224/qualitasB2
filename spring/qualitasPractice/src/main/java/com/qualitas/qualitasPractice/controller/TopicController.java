package com.qualitas.qualitasPractice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qualitas.qualitasPractice.model.Topic;
import com.qualitas.qualitasPractice.service.TopicService;

@RestController
@RequestMapping("v1/")
public class TopicController {

	@Autowired
	TopicService topicService;
	
	@GetMapping("topic")
	public List<Topic> getAllTopic() {
//		TopicService ts = new TopicService(); //tight coupling 
		return topicService.getAllTopics();
	}
	
	@GetMapping("topic/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	

	@DeleteMapping("topic/{id}")
	public void deleteTopic(@PathVariable String id) {
		 topicService.deleteTopic(id);
	}
	
	@PostMapping("topic")
	public void addTopic(@RequestBody Topic topicData) {
		topicService.addTopic(topicData);
	}
	
	@PutMapping("topic/{id}")
	public void updateTopic(@RequestBody Topic topic) {
		topicService.updateTopic(topic);
	}
	//localhost:8080/topics/v1/page?pageNo=1&sort=name
		@GetMapping("/topics/page")
		public  Page<Topic>  getTopicsByPage(
				@RequestParam("pageNo") Optional<Integer> pageParam,
				@RequestParam("sort") Optional<String>  sortBy){
			return topicService.getProductsByPage(pageParam,sortBy);
		}

		//localhost:8080/v1/search?query=spoken
		@GetMapping("/search")
		public ResponseEntity<List<Topic>> searchProducts(
				@RequestParam("query") String query){
			return ResponseEntity.ok(topicService.searchProducts(query));
		}
		
}
