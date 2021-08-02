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
import com.bacancy.SocialMedia.repository.PostRepository;

@RestController
public class PostController {

	@Autowired
	private PostRepository postRepository;
	
	@GetMapping("/social-media/posts")
	public List<PostDto> retriveAllPosts(){
		List<PostDto> posts = postRepository.findAll();
		return posts;
	}
	
	@GetMapping("/social-media/posts/{userId}")
	public List<PostDto> retriveAllPostsByUser(@PathVariable Long userId){
		List<PostDto> posts = postRepository.findAllById(userId);
		return posts;
	}
	
	@GetMapping("/social-media/posts/{id}")
	public PostDto retrivePost(@PathVariable Long id) {
		Optional<PostDto> post = postRepository.findById(id);
		return post.get();
	}
	
	@PostMapping("/social-media/posts")
	public PostDto createPost(@RequestBody PostDto dto) {
		dto.setPostCreatedDate(new Date());
		PostDto savedPost = postRepository.save(dto);
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
