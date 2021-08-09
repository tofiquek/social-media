package com.bacancy.SocialMedia.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Like {

	@Id
	@GeneratedValue
	private Long id;
	private String message;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Post post;

	@ManyToOne(fetch=FetchType.LAZY)
	private User user;
	
	
	public Like() {
		super();
	}
	public Like(Long id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
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
