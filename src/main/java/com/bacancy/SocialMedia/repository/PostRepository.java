package com.bacancy.SocialMedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bacancy.SocialMedia.entity.Post;



public interface PostRepository extends JpaRepository<Post, Long>{
	

}
