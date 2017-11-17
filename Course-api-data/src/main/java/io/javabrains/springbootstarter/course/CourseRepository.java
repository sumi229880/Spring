package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	//public List<Course> getCoursesByTopic(String topicId);
	//findBy{Property} by Spring Data
	public List<Course> findByTopicId(String topicId);
}
