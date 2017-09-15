package demo.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import demo.model.User;

@Repository("userDao")
public class UserDao {
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public User loadById(Integer id) {
		User u = new User();
		u.setName("xin ge");
		u.setPassword("123456");
		System.out.println(id);
		return u;
	}
}
