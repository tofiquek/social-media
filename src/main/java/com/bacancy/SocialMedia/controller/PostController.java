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
@RequestMapping("/posts")
public class PostController {

	
	@Autowired
	private PostService postService;
	
	@GetMapping("/{postId}")
	public ResponseEntity<PostDto> retrivePostByPostId(@PathVariable Long postId){
		return new ResponseEntity<PostDto>(postService.getPostByPostId(postId), HttpStatus.OK);
	}
	
	
	@PostMapping("/{userId}")
	public ResponseEntity<PostDto> createPost(@PathVariable(name = "userId") Long userId,@RequestBody PostDto postDto) {
		return new ResponseEntity<PostDto>(postService.addPost(userId, postDto), HttpStatus.OK);
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<PostDto> updatePost(@PathVariable Long userId,@RequestBody PostDto postDto) {
		return new ResponseEntity<PostDto>(postService.addPost(userId, postDto), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deletePost(@PathVariable Long id) {
		postService.deletePost(id);
		 return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
