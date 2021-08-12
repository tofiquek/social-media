package com.bacancy.SocialMedia.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bacancy.SocialMedia.dto.PostDto;
import com.bacancy.SocialMedia.dto.UserDto;
import com.bacancy.SocialMedia.entity.Post;
import com.bacancy.SocialMedia.repository.PostRepository;
import com.bacancy.SocialMedia.service.PostService;
import com.bacancy.SocialMedia.service.UserService;

@Service
public class PostServiceImpl implements PostService{

	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserService userService;

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<PostDto> getPostsByUserId(String email) {
		UserDto userDto = userService.getUserByEmail(email); 
		return userDto.getPosts();
	}

	@Override
	public PostDto getPostByPostId(Long postId) {
		
		Optional<Post> postOptional = postRepository.findById(postId);
		PostDto postDto = null;
		if (postOptional.isPresent()) {
			
			postDto = modelMapper.map(postOptional.get(), PostDto.class);
		}
		return postDto;
	}

	@Override
	public PostDto addPost(String email,PostDto postDto) {
		UserDto userDto = userService.getUserByEmail(email);
		postDto.setUser(userDto);
		postDto.setPostCreatedDate(new Date());
		Post post = modelMapper.map(postDto, Post.class);
		Post savedPost = postRepository.save(post);
		PostDto savedPostDto = modelMapper.map(savedPost, PostDto.class);
		return savedPostDto;
	}

	@Override
	public void deletePost(Long id) {
		postRepository.deleteById(id);
	}
	
	
	
	
}
