package com.bacancy.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bacancy.SocialMedia.dto.CommentDto;

public interface CommentRepository extends JpaRepository<CommentDto, Long>{

}
