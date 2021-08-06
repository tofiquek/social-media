package com.bacancy.SocialMedia.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * CommentDto containing attributes related to the Comment
 * @author Tofique Ahmed Khan
 *
 */
@Entity
public class Comment {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String comment;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private Post post;

	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private User user;
	
	public Comment() {
		super();
	}
	
	
	
	public Comment(Long id, String comment) {
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



	public Post getPost() {
		return post;
	}



	public void setPost(Post post) {
		this.post = post;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}
	
	

}
