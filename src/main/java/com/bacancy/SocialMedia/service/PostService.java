package com.bacancy.SocialMedia.service;


import com.bacancy.SocialMedia.dto.PostDto;

public interface PostService {
	
	PostDto getPostByPostId(Long postId);
	
	PostDto addPost(Long id,PostDto postDto) ;
	
	void deletePost(Long id );
	
	
	
}
