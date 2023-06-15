package com.app.mit.du.services;

import com.app.mit.du.stories.Story;
import com.app.mit.du.user.User;

import java.util.ArrayList;

public class BloggingApp {
	ArrayList<User> userList;

	public User addUser(User user) {
		return user;
	}

	public void removeUser(User user) {
	}

	public ArrayList<User> displayAllUsers() {
		ArrayList<User> userList1 = new ArrayList<User>();
		return userList1;
	}

	public ArrayList<Story> displayUserPosts(String username) {
		ArrayList<Story> stories = new ArrayList<Story>();
		return stories;
	}


}
