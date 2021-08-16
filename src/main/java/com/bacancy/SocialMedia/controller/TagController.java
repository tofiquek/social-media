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

import com.bacancy.SocialMedia.dto.TagDto;
import com.bacancy.SocialMedia.service.TagService;

@RestController
@RequestMapping("/tags")
public class TagController {

	@Autowired
	private TagService tagService;
	
	@PostMapping("/{postId}")
	public ResponseEntity<TagDto> addTag(@PathVariable(value = "postId") Long postId,@RequestBody TagDto tagDto) {
		return new ResponseEntity<TagDto>(tagService.addTag(postId, tagDto),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deleteTag(@PathVariable(value = "id") Long id) {
		tagService.deleteTag(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	
}
