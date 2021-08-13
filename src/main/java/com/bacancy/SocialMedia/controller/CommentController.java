package com.bacancy.SocialMedia.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bacancy.SocialMedia.dto.CommentDto;
import com.bacancy.SocialMedia.service.CommentService;

@RestController
@RequestMapping("/social-media")
public class CommentController {
	
	
	@Autowired
	private CommentService commentService;
	
//	@GetMapping("/social-media/{postId}/comments")
//	public List<Comment> retrieveComments(@PathVariable Long postId){
//		Optional<Post> posts = postRepository.findById(postId);
//		return posts.get().getComments();
//	}

	@PostMapping("/social-media/{userId}/{postId}/comments")
	public  ResponseEntity<CommentDto> addComment(@PathVariable(name = "userId") Long userId,@PathVariable(name = "postId") Long postId,@RequestBody CommentDto commentDto) {
		return new ResponseEntity<CommentDto>(commentService.addComment(userId, postId, commentDto), HttpStatus.OK);
	}
	
	@DeleteMapping("/social-media/comments/{id}")
	public ResponseEntity deleteComment(@PathVariable(name = "id") Long id) {
		return new ResponseEntity(HttpStatus.OK);
	}
}
