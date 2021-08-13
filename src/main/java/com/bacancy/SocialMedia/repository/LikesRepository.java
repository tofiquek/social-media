package com.bacancy.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bacancy.SocialMedia.entity.Likes;


@Repository
public interface LikesRepository extends JpaRepository<Likes, Long>{

}
