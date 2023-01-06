package ch07.ex02_2.service;

import ch07.ex02_2.dao.UserDao;
import ch07.ex02_2.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
}
