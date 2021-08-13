package com.bacancy.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bacancy.SocialMedia.entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}
