package demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import demo.dao.UserDao;
import demo.model.User;

@Service("userService")
public class UserService {

	@Resource
	private UserDao userDao;
	
	public User find(Integer i) {
		return userDao.loadById(i);
	}
}
