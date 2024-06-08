package com.springboot.jpa_and_hibernate.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.springboot.jpa_and_hibernate.course.Course;

@Component
@Primary// Spring should identify this component so we will name it as component
public class CourseSprigDataJPACommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(7, "Spring Dtaa JPA", "Sindhu Krovvidi"));
		repository.save(new Course(8, "Spring Data JPA 2", "Sindhu Krovvidi"));
		repository.save(new Course(9, "Spring Data JPA 3", "Sindhu Krovvidi"));
		
		repository.deleteById(7l);
		
		System.out.println(repository.findById(8l));
		System.out.println(repository.findById(9l));
		
		System.out.println(repository.findByAuthor("Sindhu Krovvidi"));
		System.out.println(repository.findByName("Spring Data JPA 3"));
	}

}
