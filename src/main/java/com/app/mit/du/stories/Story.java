package com.app.mit.du.stories;

import com.app.mit.du.interfaces.Likeable;

public class Story implements Likeable {
	String content;
	int likes;

	public Story(String content, int likes) {
		this.content = content;
		this.likes = likes;
	}

	@Override
	public void like() {

	}

	@Override
	public void unlike() {

	}
}
