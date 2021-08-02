package com.bacancy.SocialMedia.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * PostDto containing attributes related to the Post
 * @author Tofique Ahmed Khan
 *
 */
@Entity
public class PostDto {

	@Id
	@GeneratedValue
	private Long id;
	private String postName;
	private String detials;
	private Date postCreatedDate;
	private Date postUpdatedDate;

	@ManyToOne
	private UserDto user;
	
	public PostDto() {
		super();
	}
	
	public PostDto(Long id, String postName, String detials, Date postCreatedDate, Date postUpdatedDate) {
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
	
	
	
	
}