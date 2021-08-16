package com.bacancy.SocialMedia.service;

import com.bacancy.SocialMedia.dto.TagDto;

public interface TagService {

	TagDto addTag(Long postId,TagDto tagDto);
	
	void deleteTag(Long tagId);
}
