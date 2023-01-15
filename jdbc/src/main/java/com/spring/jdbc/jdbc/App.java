package com.spring.jdbc.jdbc;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-servlet.xml");

		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

		String query = "insert into student(name,city) value(?,?)";

		int update = template.update(query, "praveen", "betul");

		System.out.println("number of record inserted." + update);

	}
}
