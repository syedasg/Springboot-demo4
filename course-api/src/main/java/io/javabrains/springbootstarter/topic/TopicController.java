package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController
{
	
	@Autowired
	//atowired by type because topicService is single ton
	private TopicService topicService;
	
	
	@RequestMapping(method=RequestMethod.GET, value="/topics")
	public List<Topic> allTopics()
	{
		return topicService.getAllTopics();
	}

	@RequestMapping("/topics/{foo}")
		public Topic getTopic(@PathVariable("foo") String id)
	{
		//s="Spring1";
		System.out.println("Hiiiiiiiiiiiiiiiii"+id);
		return topicService.getTopic(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic)
	{
	topicService.addTopic(topic);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{foo}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable("foo")String id)
	{
	topicService.updateTopic(id,topic);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{foo}")
	public void deleteTopic(@PathVariable("foo")String id)
	{
		topicService.deleteTopic(id);
	}
}
