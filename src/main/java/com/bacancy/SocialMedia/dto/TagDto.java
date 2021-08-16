package com.bacancy.SocialMedia.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class TagDto {

	@JsonIgnore
	private Long id;
	private String tag;
	@JsonIgnore
	private PostDto postDto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public PostDto getPostDto() {
		return postDto;
	}

	public void setPostDto(PostDto postDto) {
		this.postDto = postDto;
	}
	
	
	
}
