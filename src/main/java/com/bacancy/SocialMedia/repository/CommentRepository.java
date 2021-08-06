package com.bacancy.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bacancy.SocialMedia.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
