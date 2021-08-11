package com.bacancy.SocialMedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bacancy.SocialMedia.entity.Post;


@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
	

}
