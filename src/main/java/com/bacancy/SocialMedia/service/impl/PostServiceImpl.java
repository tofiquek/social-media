package com.bacancy.SocialMedia.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bacancy.SocialMedia.dto.PostDto;
import com.bacancy.SocialMedia.dto.UserDto;
import com.bacancy.SocialMedia.entity.Post;
import com.bacancy.SocialMedia.entity.User;
import com.bacancy.SocialMedia.repository.PostRepository;
import com.bacancy.SocialMedia.repository.UserRepository;
import com.bacancy.SocialMedia.service.PostService;
import com.bacancy.SocialMedia.service.UserService;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserService userService;

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<PostDto> getPostsByUserId(Long userId) {
		UserDto userDto = userService.getUserById(userId); 
		return userDto.getPosts();
		
	}

	@Override
	public PostDto getPostByPostId(Long postId) {
		
		return null;
	}

	@Override
	public PostDto addPost(Long userId,PostDto postDto) {
		UserDto userDto = userService.getUserById(userId);
		postDto.setUser(userDto);
		postDto.setPostCreatedDate(new Date());
		Post post = modelMapper.map(postDto, Post.class);
		Post savedPost = postRepository.save(post);
		PostDto savedPostDto = modelMapper.map(savedPost, PostDto.class);
		return null;
	}

	@Override
	public void deletePost(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
