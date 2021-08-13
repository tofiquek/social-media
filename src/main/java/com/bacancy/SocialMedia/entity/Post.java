package com.bacancy.SocialMedia.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * PostDto containing attributes related to the Post
 * @author Tofique Ahmed Khan
 *
 */
@Entity
@Table(name = "posts")
public class Post {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name = "post_name")
	private String postName;
	
	@Column(name="detail")
	private String detail;
	
	@Column(name="post_created_date")
	private Date postCreatedDate;
	
	@Column(name="post_updated_date")
	private Date postUpdatedDate;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "user_id",nullable = false)
	private User user;
	
	@OneToMany(mappedBy = "post",fetch=FetchType.LAZY)
	private List<Comment> comments;
	
	@OneToMany(mappedBy = "post",fetch=FetchType.LAZY)
	private List<Likes> likes;
	
	
	public Post() {
		super();
	}
	
	public Post(Long id, String postName, String detials, Date postCreatedDate, Date postUpdatedDate) {
		super();
		this.id = id;
		this.postName = postName;
		this.detail = detials;
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
		return detail;
	}
	public void setDetials(String detials) {
		this.detail = detials;
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
