package com.bacancy.SocialMedia.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bacancy.SocialMedia.dto.LikesDto;
import com.bacancy.SocialMedia.dto.PostDto;
import com.bacancy.SocialMedia.dto.UserDto;
import com.bacancy.SocialMedia.entity.Likes;
import com.bacancy.SocialMedia.repository.LikesRepository;
import com.bacancy.SocialMedia.service.LikesService;
import com.bacancy.SocialMedia.service.PostService;
import com.bacancy.SocialMedia.service.UserService;

@Service
public class LikesServiceImpl implements LikesService{
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private LikesRepository likesRepository;

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public LikesDto like(Long userId, Long postId) {
		UserDto userDto = userService.getUserById(userId);
		PostDto postDto = postService.getPostByPostId(postId);
		LikesDto likeDto = new LikesDto();
		likeDto.setUserDto(userDto);
		likeDto.setPostDto(postDto);
		Likes likes = modelMapper.map(likeDto, Likes.class);
		Likes savedlikes = likesRepository.save(likes);
		LikesDto savedLikesDto = modelMapper.map(savedlikes, LikesDto.class);
		return savedLikesDto;
	}

	@Override
	public void unlike(Long userId, Long postId) {
		UserDto userDto = userService.getUserById(userId);
		PostDto postDto = postService.getPostByPostId(postId);
		LikesDto likeDto = new LikesDto();
		likeDto.setUserDto(userDto);
		likeDto.setPostDto(postDto);
		Likes likes = modelMapper.map(likeDto, Likes.class);
		likesRepository.delete(likes);
		
	
	}

}
