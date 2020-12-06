package com.example.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Topic;
import com.example.services.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		// http://localhost:8080/topics
		// after run the project, it will show up
		//[{"id":"Spring","name":"Spring Framework","description":"Spring Framework Description"},
		// {"id":"java","name":"Core Java","description":"Core Java Description"},
		// {"id":"javascript","name":"JavaScript","description":"JavaScriptDescription"}]
		//the generated JSON has key names corresponding to properly names of the Topic class
		
//		return Arrays.asList(
//				new Topic("Spring", "Spring Framework", "Spring Framework Description"),
//				new Topic("java", "Core Java", "Core Java Description"),
//				new Topic("javascript", "JavaScript", "JavaScriptDescription")			
//		);
		
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) { 
		//@PathVariable tell spring that this whatever im expecting is an argument here is actually a variable in a path
		//http://localhost:8080/topics/java
		//result: {"id":"java","name":"Core Java","description":"Core Java Description"}
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		//POOSTMAN: 
		// POST	http://localhost:8080/topics
		/*
		 * {
    			"id": "sql",
    			"name": "SQL ",
    			"description": "SQL Description"
			}
		 */
		topicService.addTopic(topic);
		
	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		//POOSTMAN: 
		// PUT	http://localhost:8080/topics/sql
		/*
		 * {
    			"id": "postgresql",
    			"name": "SQL ",
    			"description": "SQL Description"
			}
		 */
		topicService.updateTopic(topic, id);
		
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@RequestBody Topic topic, @PathVariable String id) {
		//POOSTMAN: 
		// DELETE	http://localhost:8080/topics/sql
		/*
		 * {
    			"id": "postgresql",
    			"name": "SQL ",
    			"description": "SQL Description"
			}
		 */
		topicService.deleteTopic(topic, id);
		
	}
	

}
