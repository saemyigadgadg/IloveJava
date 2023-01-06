package ch07.ex03.dao;

import ch07.ex03.domain.User;

public interface UserDao {
	public User selectUser();
	public void insertUser(User user); //유저데이터를 추가합니다.
	public void updateUser(String userName); //유저데이터를 수정합니다.
	public void deleteUser(); //유저데이터를 삭제합니다.
}
