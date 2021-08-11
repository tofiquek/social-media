package com.bacancy.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bacancy.SocialMedia.entity.Like;


@Repository
public interface LikeRepository extends JpaRepository<Like, Long>{

}
