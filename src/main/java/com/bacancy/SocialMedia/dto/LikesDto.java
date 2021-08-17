package com.bacancy.SocialMedia.dto;


public class LikesDto {

	
	private Long id;
	private int totalLikes;
	private PostDto postDto;
	private UserDto userDto;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public int getTotalLikes() {
		return totalLikes;
	}
	public void setTotalLikes(int totalLikes) {
		this.totalLikes = totalLikes;
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
