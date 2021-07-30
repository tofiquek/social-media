package com.bacancy.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bacancy.SocialMedia.dto.UserDto;

public interface UserRepository extends JpaRepository<UserDto, Long>{

}
