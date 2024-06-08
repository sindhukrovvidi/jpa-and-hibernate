package com.springboot.jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QURY = """
			insert into course (id, name, author) values (1,'JDBC', 'Sindhu');
			""";
//	Once the query is made, we need to tell  Spring application to runn it at the application launch. for this we will be using CommandLineRunnes.
	public void insert() {
		springJdbcTemplate.update(INSERT_QURY);
	}
}
