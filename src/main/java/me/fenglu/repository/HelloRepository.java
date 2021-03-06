package me.fenglu.repository;

import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import me.fenglu.model.User;

@Repository
public class HelloRepository {
	
	@Inject
	private HibernateTemplate hibernateTemplate;
	
	public void add(User u) throws SQLException {
		hibernateTemplate.save(u);
	}

	public User fetch(String id) {
		return hibernateTemplate.get(User.class, id);
	}

}
