package com.bacancy.SocialMedia.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bacancy.SocialMedia.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	

}
