package com.springboot.jpa_and_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.springboot.jpa_and_hibernate.course.Course;

@Component
@Primary// Spring should identify this component so we will name it as component
public class CourseJPACommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJPARepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(4, "Spring JPA", "Sindhu Krovvidi"));
		repository.insert(new Course(5, "Spring JPA 2", "Sindhu Krovvidi"));
		repository.insert(new Course(6, "Spring JPA 3", "Sindhu Krovvidi"));
		
		repository.deleteById(4);
		
		System.out.println(repository.findById(5));
		System.out.println(repository.findById(6));
	}

}
