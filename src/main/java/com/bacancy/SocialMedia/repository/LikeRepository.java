package com.bacancy.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bacancy.SocialMedia.dto.LikeDto;

public interface LikeRepository extends JpaRepository<LikeDto, Long>{

}
