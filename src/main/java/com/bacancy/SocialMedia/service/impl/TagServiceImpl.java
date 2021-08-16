package com.bacancy.SocialMedia.service.impl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bacancy.SocialMedia.dto.PostDto;
import com.bacancy.SocialMedia.dto.TagDto;
import com.bacancy.SocialMedia.entity.Tag;
import com.bacancy.SocialMedia.repository.TagRepository;
import com.bacancy.SocialMedia.service.PostService;
import com.bacancy.SocialMedia.service.TagService;

@Service
public class TagServiceImpl implements TagService{

	@Autowired
	private PostService postService;
	
	@Autowired
	private TagRepository tagRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public TagDto addTag(Long postId, TagDto tagDto) {
		PostDto post = postService.getPostByPostId(postId);
		tagDto.setPostDto(post);
		Tag tag = modelMapper.map(tagDto, Tag.class);
		Tag savedTag = tagRepository.save(tag);
		TagDto savedTagDto = modelMapper.map(savedTag, TagDto.class);
		return savedTagDto;
	}

	@Override
	public void deleteTag(Long tagId) {
		tagRepository.deleteById(tagId);
	}

}
