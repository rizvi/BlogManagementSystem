package com.app.mit.du.user;

public class Blogger extends User {
	public Blogger(String username, String password) {
		super(username, password);
		this.username = username;
		this.password = password;
	}

	@Override
	public void displayProfile() {

	}

	public String getUsername() {
		return username;
	}
}
