package com.bacancy.SocialMedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bacancy.SocialMedia.dto.LikesDto;
import com.bacancy.SocialMedia.service.LikesService;

@RestController
@RequestMapping("/likes")
public class LikesController {

	@Autowired
	private LikesService likesService;
	
	@PostMapping("/{userId}/{postId}")
	public ResponseEntity<LikesDto> like(@PathVariable Long userId,@PathVariable Long postId) {
		return new ResponseEntity<LikesDto>(likesService.like(userId, postId),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{userId}/{postId}")
	public ResponseEntity unlike(@PathVariable Long userId,@PathVariable Long postId) {
		likesService.unlike(userId, postId);
		return new ResponseEntity(HttpStatus.OK);
	}
}
