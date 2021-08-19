package com.bacancy.SocialMedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bacancy.SocialMedia.entity.Likes;


@Repository
public interface LikesRepository extends JpaRepository<Likes, Long>{

	@Query("FROM Likes WHERE user_id = :userId and post_id= :postId")
	List<Likes> findAllByUsersPosts(@Param("userId") Long userId,@Param("postId")Long postId);
}
