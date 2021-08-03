package com.bacancy.SocialMedia.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bacancy.SocialMedia.dto.PostDto;
import com.bacancy.SocialMedia.dto.UserDto;
import com.bacancy.SocialMedia.repository.PostRepository;
import com.bacancy.SocialMedia.repository.UserRepository;

@RestController
public class PostController {

	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/social-media/posts")
	public List<PostDto> retriveAllPosts(){
		List<PostDto> posts = postRepository.findAll();
		return posts;
	}
	
	@GetMapping("/social-media/{userId}/posts")
	public List<PostDto> retriveAllPostsByUser(@PathVariable Long userId){
		Optional<UserDto> userOptional = userRepository.findById(userId);
		return userOptional.get().getPosts();
	}
	
	
	
	@PostMapping("/social-media/{userId}/posts")
	public PostDto createPost(@PathVariable Long userId,@RequestBody PostDto postDto) {
		Optional<UserDto> user = userRepository.findById(userId);
		UserDto userDto = user.get();
		postDto.setUser(userDto);
		postDto.setPostCreatedDate(new Date());
		PostDto savedPost = postRepository.save(postDto);
		return savedPost;
	}
	
	@PutMapping("/social-media/posts")
	public PostDto updatePost(@RequestBody PostDto dto) {
		dto.setPostUpdatedDate(new Date());
		PostDto updatedPost = postRepository.save(dto);
		return updatedPost;
	}
	
	@DeleteMapping("/social-media/posts/{id}")
	public void deletePost(@PathVariable Long id) {
		postRepository.deleteById(id);
	}
	
}
