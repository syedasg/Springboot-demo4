package io.javabrains.springbootstarter.topic;
//single ton

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	
	private List<Topic> topics=new ArrayList<Topic>
			(Arrays.asList
			(
			new Topic("Spring1","Syed2","Decription 2"),
			new Topic("Spring1","Syed","Decription 1"),
			
			new Topic("Spring1","Syed3","Decription 3")
			)
			);
	/*a1.add(new Topic("Spring1","Syed","Decription 1"));
//new Topic("Spring2","Syed","Description 1")
//new Topic("Spring3","Syed","Description 1")
	a1.add(new Topic("Spring1","Syed","Decription 2"));
	a1.add(new Topic("Spring1","Syed","Decription 3"));
	//a1.add(new String());*/
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t->t.getId().contentEquals(id)).findAny().get();
	}
	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}
	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		//topics.
		for(int i=0;i<topics.size();i++)
		{
			if(topics.get(i).getId().equals(id))			{
				System.out.println("TOPIC SERVICE");
				topics.set(i,topic);
			}
			/*System.out.println("TOPIC SERVICE");
			
			System.out.println(topics.stream().filter(t->t.getId().equals(id)).findAny().get());
			break;*/
		}
	}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t ->t.getId().equals(id)); 
	}
	}


