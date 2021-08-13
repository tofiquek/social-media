package com.bacancy.SocialMedia.dto;

import java.util.Date;
import java.util.List;


public class UserDto {
	private long id;
	private String email;
	private UserProfileDto userProfile;
	private List<PostDto> posts;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public UserProfileDto getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(UserProfileDto userProfile) {
		this.userProfile = userProfile;
	}
	public List<PostDto> getPosts() {
		return posts;
	}
	public void setPosts(List<PostDto> posts) {
		this.posts = posts;
	}
	
	
}
