package com.springboot.jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.jpa_and_hibernate.course.Course;

@Component // Spring should identify this component so we will name it as component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJDBCRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1, "Spring JDBC", "Sindhu Krovvidi"));
		repository.insert(new Course(2, "Spring JDBC 2", "Sindhu Krovvidi"));
		repository.insert(new Course(3, "Spring JDBC 3", "Sindhu Krovvidi"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}

}
