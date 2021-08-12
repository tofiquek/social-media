package com.bacancy.SocialMedia.service.impl;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bacancy.SocialMedia.dto.CommentDto;
import com.bacancy.SocialMedia.dto.PostDto;
import com.bacancy.SocialMedia.dto.UserDto;
import com.bacancy.SocialMedia.entity.Comment;
import com.bacancy.SocialMedia.repository.CommentRepository;
import com.bacancy.SocialMedia.service.CommentService;
import com.bacancy.SocialMedia.service.PostService;
import com.bacancy.SocialMedia.service.UserService;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private UserService userService;
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CommentDto addComment(String userEmail, Long postId, CommentDto commentDto) {
		UserDto userDto = userService.getUserByEmail(userEmail);
		PostDto postDto = postService.getPostByPostId(postId);
		commentDto.setUserDto(userDto);
		commentDto.setPostDto(postDto);
		Comment comment = modelMapper.map(commentDto, Comment.class);
		Comment savedComment = commentRepository.save(comment);
		CommentDto savedCommentDto = modelMapper.map(savedComment, CommentDto.class);
		return savedCommentDto;
	}

	@Override
	public void deletePost(Long id) {
		commentRepository.deleteById(id);
		
	}

	
}
