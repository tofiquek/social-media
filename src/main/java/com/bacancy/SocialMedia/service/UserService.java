package com.bacancy.SocialMedia.service;

import java.util.List;

import com.bacancy.SocialMedia.dto.UserDto;

public interface UserService {
	
	/**
	 * Add user
	 * @param user
	 * @return
	 */
	UserDto addUser(UserDto user);
	
	/**
	 * Get Existing User By Id
	 * @param id
	 * @return
	 */
	UserDto getUserById(Long id);
	
	List<UserDto> allUsers();

	
}
