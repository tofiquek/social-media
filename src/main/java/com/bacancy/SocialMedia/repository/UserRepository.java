package com.bacancy.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bacancy.SocialMedia.entity.User;



public interface UserRepository extends JpaRepository<User, Long>{

}
