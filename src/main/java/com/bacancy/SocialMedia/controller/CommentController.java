package com.bacancy.SocialMedia.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bacancy.SocialMedia.dto.CommentDto;
import com.bacancy.SocialMedia.dto.PostDto;
import com.bacancy.SocialMedia.dto.UserDto;
import com.bacancy.SocialMedia.repository.CommentRepository;
import com.bacancy.SocialMedia.repository.PostRepository;
import com.bacancy.SocialMedia.repository.UserRepository;

@RestController
public class CommentController {
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CommentRepository commentRepository;
	
	@GetMapping("/social-media/{postId}/comments")
	public List<CommentDto> retrieveComments(@PathVariable Long postId){
		Optional<PostDto> posts = postRepository.findById(postId);
		return posts.get().getComments();
	}

	@PostMapping("/social-media/{userId}/{postId}/comments")
	public CommentDto addComment(@PathVariable Long userId,@PathVariable Long postId,@RequestBody CommentDto commentDto) {
		Optional<UserDto> user = userRepository.findById(userId);
		Optional<PostDto> post = postRepository.findById(postId);
		UserDto userDto = user.get();
		PostDto postDto = post.get();
		commentDto.setPost(postDto);
		commentDto.setUser(userDto);
		
		CommentDto savedComment = commentRepository.save(commentDto);
		return savedComment;
	}
	
	@DeleteMapping("/social-media/comments/{id}")
	public void deleteComment(@PathVariable Long id) {
		commentRepository.deleteById(id);
	}
}
