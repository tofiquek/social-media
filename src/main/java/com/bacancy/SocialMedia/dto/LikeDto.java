package com.bacancy.SocialMedia.dto;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.bacancy.SocialMedia.entity.Post;
import com.bacancy.SocialMedia.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class LikeDto {

	private Long id;
	private String message;
	
	private Post post;

	private User user;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
