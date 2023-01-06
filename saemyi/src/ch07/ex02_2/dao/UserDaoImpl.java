package ch07.ex02_2.dao;

import ch07.ex02_2.domain.User;

public class UserDaoImpl implements UserDao {
	@Override
	public User selectUser() {
		return new User("최한석");
	}
}
