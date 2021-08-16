package com.bacancy.SocialMedia.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * UserDto containing attributes related to the User
 * @author Tofique Ahmed Khan
 *
 */

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	
	@Column(name = "email")
	private String email;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	private UserProfile userProfile;

	@JsonIgnore
	@OneToMany(mappedBy = "user",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Post> posts;
	
	public User() {
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public UserProfile getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
	
	
}
