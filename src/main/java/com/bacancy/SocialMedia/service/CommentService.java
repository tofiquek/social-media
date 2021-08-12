package com.bacancy.SocialMedia.service;

import com.bacancy.SocialMedia.dto.CommentDto;

public interface CommentService {
	
	CommentDto addComment(String userEmail,Long postId,CommentDto commentDto);
	
	void deletePost(Long id );
}