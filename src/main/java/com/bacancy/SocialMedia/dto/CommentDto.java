package com.bacancy.SocialMedia.dto;

/**
 * CommentDto containing attributes related to the Comment
 * @author Tofique Ahmed Khan
 *
 */
public class CommentDto {
	
	private Long id;
	private String comment;
		
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
	
	

}
