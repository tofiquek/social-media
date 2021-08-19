package com.bacancy.SocialMedia.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LikesDto {

	
	private Long id;
	
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
