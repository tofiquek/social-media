package com.bacancy.SocialMedia.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class PostDto {

	private Long id;
	private String postName;
	private String detials;
	private Date postCreatedDate;
	private Date postUpdatedDate;
	
	@JsonIgnore
	private UserDto userDto;
	
	
	private List<CommentDto> comments;
	
	
	private List<LikesDto> likes;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getDetials() {
		return detials;
	}
	public void setDetials(String detials) {
		this.detials = detials;
	}
	public Date getPostCreatedDate() {
		return postCreatedDate;
	}
	public void setPostCreatedDate(Date postCreatedDate) {
		this.postCreatedDate = postCreatedDate;
	}
	public Date getPostUpdatedDate() {
		return postUpdatedDate;
	}
	public void setPostUpdatedDate(Date postUpdatedDate) {
		this.postUpdatedDate = postUpdatedDate;
	}
	public UserDto getUser() {
		return userDto;
	}
	public void setUser(UserDto userDto) {
		this.userDto = userDto;
	}
	public List<CommentDto> getComments() {
		return comments;
	}
	public void setComments(List<CommentDto> comments) {
		this.comments = comments;
	}
	public List<LikesDto> getLikes() {
		return likes;
	}
	public void setLikes(List<LikesDto> likes) {
		this.likes = likes;
	}

	
}
