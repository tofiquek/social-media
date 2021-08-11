package com.bacancy.SocialMedia.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * PostDto containing attributes related to the Post
 * @author Tofique Ahmed Khan
 *
 */
@Entity
public class Post {

	@Id
	@GeneratedValue
	private Long id;
	private String postName;
	private String detials;
	private Date postCreatedDate;
	private Date postUpdatedDate;

	@JsonBackReference
	@ManyToOne()
	@JoinColumn(name = "users_id",nullable = false)
	private User user;
	
	@OneToMany(mappedBy = "post")
	private List<Comment> comments;
	
	@OneToMany(mappedBy = "post")
	private List<Like> likes;
	
	
	public Post() {
		super();
	}
	
	public Post(Long id, String postName, String detials, Date postCreatedDate, Date postUpdatedDate) {
		super();
		this.id = id;
		this.postName = postName;
		this.detials = detials;
		this.postCreatedDate = postCreatedDate;
		this.postUpdatedDate = postUpdatedDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getDetials() {
		return detials;
	}
	public void setDetials(String detials) {
		this.detials = detials;
	}
	public Date getPostCreatedDate() {
		return postCreatedDate;
	}
	public void setPostCreatedDate(Date postCreatedDate) {
		this.postCreatedDate = postCreatedDate;
	}
	public Date getPostUpdatedDate() {
		return postUpdatedDate;
	}
	public void setPostUpdatedDate(Date postUpdatedDate) {
		this.postUpdatedDate = postUpdatedDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	
	
	
}
