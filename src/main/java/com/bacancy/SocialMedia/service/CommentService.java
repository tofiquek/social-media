package com.bacancy.SocialMedia.service;

import com.bacancy.SocialMedia.dto.CommentDto;

public interface CommentService {
	
	CommentDto addComment(Long userId,Long postId,CommentDto commentDto);
	
	void deletePost(Long id );
}