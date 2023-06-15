package com.app.mit.du;

import com.app.mit.du.db.DBConnection;
import com.app.mit.du.stories.Story;
import com.app.mit.du.services.BloggingApp;
import com.app.mit.du.user.Reader;
import com.app.mit.du.user.User;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BloggingApp bloggingApp = new BloggingApp();
		Reader user1 = new Reader("rizvi", "rizvi123");
		Reader user2 = new Reader("rana", "rana123");
		Reader user3 = new Reader("mahmud", "mahmudl23");

		// add users
		bloggingApp.addUser(user1);
		bloggingApp.addUser(user2);
		bloggingApp.addUser(user3);

		// display users
		ArrayList<User> userList = bloggingApp.displayAllUsers();
		System.out.println(userList);

		// Remove User
		bloggingApp.removeUser(user3);

		Story story1 = new Story("Hello, we are in MIT classroom", 25);
		Story story2 = new Story(" OOP class is running", 25);
		Story story3 = new Story("We all are doing an assignment on social media app", 25);

		// Add post for every user
		user1.addPost("I live in Australia");
		user2.addPost("I live in America");
		user1.addPost("I live in Canada");

		// Display User Posts
		ArrayList<Story> storyFromUser1 = bloggingApp.displayUserPosts(user1.getUsername());
		ArrayList<Story> storyFromUser2 = bloggingApp.displayUserPosts(user2.getUsername());
		ArrayList<Story> storyFromUser3 = bloggingApp.displayUserPosts(user3.getUsername());

		System.out.println(storyFromUser1);
		System.out.println(storyFromUser2);
		System.out.println(storyFromUser3);

		// Like Posts
		story1.like();
		story2.like();
		story3.like();

		// Unlike stories
		story1.unlike();
		story2.unlike();
		story3.unlike();

		DBConnection dbConnection = new DBConnection();
		dbConnection.getFileFromResources();

	}
}
