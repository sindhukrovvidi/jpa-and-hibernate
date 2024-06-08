package com.springboot.jpa_and_hibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpa_and_hibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

	List<Course> findByAuthor(String name); // no need to implement these methods, just use the name of the columns and the function you wanna perform
	
	List<Course> findByName(String name);
}
