package com.bacancy.SocialMedia.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 * UserDto containing attributes related to the User
 * @author Tofique Ahmed Khan
 *
 */

@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private Date dateOfBirth;
	private String email;
	private String address;
	
//	@OneToMany(mappedBy = "user")
//	private List<Post> posts;
	
	public User() {
		super();
	}
	
	public User(long id, String name, Date dateOfBirth, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.address = address;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//
//	public List<Post> getPosts() {
//		return posts;
//	}
//
//	public void setPosts(List<Post> posts) {
//		this.posts = posts;
//	}
//	
//	
	
}