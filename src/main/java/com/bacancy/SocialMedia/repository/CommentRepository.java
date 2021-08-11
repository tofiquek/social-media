package com.bacancy.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bacancy.SocialMedia.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}