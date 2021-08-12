package com.bacancy.SocialMedia.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bacancy.SocialMedia.dto.PostDto;
import com.bacancy.SocialMedia.service.PostService;


@RestController
@RequestMapping("/social-media")
public class PostController {

	
	@Autowired
	private PostService postService;
		
	
	@GetMapping("/{email}/posts")
	public ResponseEntity<List<PostDto>> retriveAllPostsByUser(@PathVariable String email){
		return new ResponseEntity(postService.getPostsByUserId(email),HttpStatus.OK);
	}
	
	@GetMapping("/posts/{postId}")
	public ResponseEntity<PostDto> retrivePostByPostId(@PathVariable Long postId){
		return new ResponseEntity<PostDto>(postService.getPostByPostId(postId), HttpStatus.OK);
	}
	
	
	@PostMapping("/{userEmail}/posts")
	public ResponseEntity<PostDto> createPost(@PathVariable String userEmail,@RequestBody PostDto postDto) {
		return new ResponseEntity<PostDto>(postService.addPost(userEmail, postDto), HttpStatus.OK);
	}
	
	@PutMapping("/{userEmail}/posts")
	public ResponseEntity<PostDto> updatePost(@PathVariable String userEmail,@RequestBody PostDto postDto) {
		return new ResponseEntity<PostDto>(postService.addPost(userEmail, postDto), HttpStatus.OK);
	}
	
	@DeleteMapping("/posts/{id}")
	public ResponseEntity deletePost(@PathVariable Long id) {
		 return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
