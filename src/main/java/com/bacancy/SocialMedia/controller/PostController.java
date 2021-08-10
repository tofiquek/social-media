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
import com.bacancy.SocialMedia.entity.Post;
import com.bacancy.SocialMedia.entity.User;
import com.bacancy.SocialMedia.repository.PostRepository;
import com.bacancy.SocialMedia.repository.UserRepository;
import com.bacancy.SocialMedia.service.PostService;
import com.bacancy.SocialMedia.service.UserService;

@RestController
public class PostController {

	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/social-media/posts")
	public List<Post> retriveAllPosts(){
		List<Post> posts = postRepository.findAll();
		return posts;
	}
	
	@GetMapping("/social-media/{userId}/posts")
	public List<PostDto> retriveAllPostsByUser(@PathVariable Long userId){
		return postService.getPostsByUserId(userId);
	}
	
	
	
	@PostMapping("/social-media/{userId}/posts")
	public PostDto createPost(@PathVariable Long userId,@RequestBody PostDto postDto) {
		return postService.addPost(userId, postDto);
	}
	
	@PutMapping("/social-media/{userId}/posts")
	public Post updatePost(@PathVariable Long userId,@RequestBody Post postDto) {
		Optional<User> user = userRepository.findById(userId);
		User userDto = user.get();
		postDto.setUser(userDto);
		postDto.setPostUpdatedDate(new Date());
		Post updatedPost = postRepository.save(postDto);
		return updatedPost;
	}
	
	@DeleteMapping("/social-media/posts/{id}")
	public void deletePost(@PathVariable Long id) {
		postRepository.deleteById(id);
	}
	
}
