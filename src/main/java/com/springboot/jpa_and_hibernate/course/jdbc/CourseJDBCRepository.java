package com.springboot.jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.jpa_and_hibernate.course.Course;

@Repository
public class CourseJDBCRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QURY = """
			insert into course (id, name, author) values (?,?, ?);
			""";
	
	private static String DELETE_QURY = """
			delete from course where id = ?;
			""";
	
//	Once the query is made, we need to tell  Spring application to run it at the application launch. for this we will be using CommandLineRunnes.
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QURY, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QURY, id);
	}
}
