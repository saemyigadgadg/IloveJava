package ch07.ex02_2;

import ch07.ex02_2.dao.UserDao;
import ch07.ex02_2.dao.UserDaoImpl;
import ch07.ex02_2.presentation.Console;
import ch07.ex02_2.presentation.UserIo;
import ch07.ex02_2.service.UserService;
import ch07.ex02_2.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		Console.info("start.");
		userIo.play();
		Console.info("end.");		
	}
}