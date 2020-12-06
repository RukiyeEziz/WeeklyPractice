package com.example.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Topic;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		// http://localhost:8080/topics
		// after run the project, it will show up
		//[{"id":"Spring","name":"Spring Framework","description":"Spring Framework Description"},
		// {"id":"java","name":"Core Java","description":"Core Java Description"},
		// {"id":"javascript","name":"JavaScript","description":"JavaScriptDescription"}]
		//the generated JSON has key names corresponding to properly names of the Topic class
		return Arrays.asList(
				new Topic("Spring", "Spring Framework", "Spring Framework Description"),
				new Topic("java", "Core Java", "Core Java Description"),
				new Topic("javascript", "JavaScript", "JavaScriptDescription")			
		);
	}
	
	

}
