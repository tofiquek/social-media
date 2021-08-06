package com.bacancy.SocialMedia.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class CommentDto {

	private Long id;

	private String comment;
	
	
	@JsonIgnore
	private PostDto postDto;

	
	@JsonIgnore
	private UserDto userDto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public PostDto getPostDto() {
		return postDto;
	}

	public void setPostDto(PostDto postDto) {
		this.postDto = postDto;
	}

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}
	
	
}
