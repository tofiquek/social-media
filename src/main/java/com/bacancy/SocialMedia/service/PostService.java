package com.bacancy.SocialMedia.service;

import java.util.List;

import com.bacancy.SocialMedia.dto.PostDto;

public interface PostService {

	List<PostDto> getPostsByUserId(String email);
	
	PostDto getPostByPostId(Long postId);
	
	PostDto addPost(String email,PostDto postDto);
	
	void deletePost(Long id );
	
	
	
}
