package com.bacancy.SocialMedia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="likes")
public class Likes {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Column(name = "total_likes")
	private int totalLikes;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Post post;

	@ManyToOne(fetch=FetchType.LAZY)
	private User user;
	
	
	public Likes() {
		super();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public int getTotalLikes() {
		return totalLikes;
	}

	public void setTotalLikes(int totalLikes) {
		this.totalLikes = totalLikes;
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
