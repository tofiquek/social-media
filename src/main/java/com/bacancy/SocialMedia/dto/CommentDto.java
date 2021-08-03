package com.bacancy.SocialMedia.dto;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * CommentDto containing attributes related to the Comment
 * @author Tofique Ahmed Khan
 *
 */
public class CommentDto {
	
	private Long id;
	private String comment;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private PostDto post;

	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private UserDto user;
	
	public CommentDto() {
		super();
	}
	
	
	
	public CommentDto(Long id, String comment) {
		super();
		this.id = id;
		this.comment = comment;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}



	public PostDto getPost() {
		return post;
	}



	public void setPost(PostDto post) {
		this.post = post;
	}



	public UserDto getUser() {
		return user;
	}



	public void setUser(UserDto user) {
		this.user = user;
	}
	
	

}
