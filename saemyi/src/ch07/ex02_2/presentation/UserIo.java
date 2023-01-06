package ch07.ex02_2.presentation;

import ch07.ex02_2.service.UserService;

public class UserIo {
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void play() {
		Console.info(userService.getUser());
	}
}
