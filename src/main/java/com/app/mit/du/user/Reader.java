package com.app.mit.du.user;

import java.util.ArrayList;

public class Reader extends User {
	public ArrayList<String> posts;

	public Reader(String username, String password) {
		super(username, password);
		this.username = username;
		this.password = password;
	}

	@Override
	public void displayProfile() {

	}

	public void addPost(String post) {

	}

	public String getUsername() {
		return username;
	}
}
