package com.bacancy.SocialMedia.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bacancy.SocialMedia.dto.CommentDto;
import com.bacancy.SocialMedia.dto.LikeDto;
import com.bacancy.SocialMedia.dto.PostDto;
import com.bacancy.SocialMedia.dto.UserDto;
import com.bacancy.SocialMedia.repository.LikeRepository;
import com.bacancy.SocialMedia.repository.PostRepository;
import com.bacancy.SocialMedia.repository.UserRepository;

@RestController
public class LikeController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private LikeRepository likeRepository;
	
	@PostMapping("/social-media/{userId}/{postId}/likes")
	public LikeDto postLike(@PathVariable Long userId,@PathVariable Long postId) {
		
		
		Optional<UserDto> user = userRepository.findById(userId);
		Optional<PostDto> post = postRepository.findById(postId);
		UserDto userDto = user.get();
		PostDto postDto = post.get();
		LikeDto likeDto = new LikeDto();
		likeDto.setPost(postDto);
		likeDto.setUser(userDto);
		
		LikeDto like = likeRepository.save(likeDto);
		
		return like;
	}
	
	
	
}
