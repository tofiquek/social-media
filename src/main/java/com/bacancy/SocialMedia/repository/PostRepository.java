package com.bacancy.SocialMedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bacancy.SocialMedia.dto.PostDto;

public interface PostRepository extends JpaRepository<PostDto, Long>{
	
	public List<PostDto> findAllById(Long userLong);

}
