package com.bacancy.SocialMedia.service;

import com.bacancy.SocialMedia.dto.LikesDto;

public interface LikesService {

	LikesDto like(Long userId, Long postId);
	void unlike(Long userId,Long postId);
}
