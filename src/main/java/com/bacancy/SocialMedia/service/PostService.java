package com.bacancy.SocialMedia.service;

import java.util.List;

import com.bacancy.SocialMedia.dto.PostDto;

public interface PostService {

	List<PostDto> getPostsByUserId(Long userId);
	
	PostDto getPostByPostId(Long postId);
	
	PostDto addPost(Long userId,PostDto postDto);
	
	void deletePost(Long id );
	
	
	
}
