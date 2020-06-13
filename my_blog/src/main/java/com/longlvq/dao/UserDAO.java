package com.longlvq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.longlvq.models.User;


public class UserDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private final String SQL_GET_LIST = "SELECT * FROM user ORDER BY id DESC";
	private final String SQL_GET_USER = "SELECT * FROM user ORDER BY id DESC";
	private final String SQL_ADD_USER = "SELECT * FROM user ORDER BY id DESC";
	private final String SQL_BLOCK_USER = "SELECT * FROM user ORDER BY id DESC";
	public List<User> getListUser() {
		return jdbcTemplate.query(SQL_GET_LIST, new BeanPropertyRowMapper<>(User.class));
	}
	public User getUser() {
		return jdbcTemplate.queryForObject(SQL_GET_USER, new BeanPropertyRowMapper<>(User.class));
	}
	public int getAddUser(User user) {
		return jdbcTemplate.update(SQL_ADD_USER, user);
	}
	public List<User> getBlockUser() {
		return jdbcTemplate.query(SQL_GET_LIST, new BeanPropertyRowMapper<>(User.class));
	}
}
