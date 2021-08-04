package com.bacancy.SocialMedia.dto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class LikeDto {

	@Id
	@GeneratedValue
	private Long id;
	private String message;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private PostDto post;

	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private UserDto user;
	
	
	public LikeDto() {
		super();
	}
	public LikeDto(Long id, String message) {
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
	public PostDto getPost() {
		return post;
	}
	public void setPost(PostDto post) {
		this.post = post;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	
	
	
}
