package com_my_hr.presentation;

public enum Job {
EXIT, LIST, ADD, FIX, DEL;
	
	public static final Job valueOf(int ordinal) {
		return values()[ordinal];
	}
}
