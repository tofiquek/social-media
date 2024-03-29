package com.bacancy.SocialMedia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * CommentDto containing attributes related to the Comment
 * @author Tofique Ahmed Khan
 *
 */
@Entity
@Table(name = "comments")
public class Comment {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name="comment")
	private String comment;
	
	@JoinColumn(name = "post_id")
	@ManyToOne(fetch=FetchType.LAZY)
	private Post post;

	@JoinColumn(name = "user_id")
	@ManyToOne(fetch=FetchType.LAZY)
	private User user;
	
	public Comment() {
		super();
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
