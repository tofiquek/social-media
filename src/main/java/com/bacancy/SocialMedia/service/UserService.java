package com.bacancy.SocialMedia.service;

import java.util.List;

import com.bacancy.SocialMedia.dto.UserDto;


public interface UserService {
	
	/**
	 * Add user
	 * @param user
	 * @return
	 */
	UserDto addUser(UserDto userDto);
	
	/**
	 * Get Existing User By Id
	 * @param id
	 * @return
	 */
	UserDto getUserById(Long id);
	
	/**
	 * To get List of all User
	 * @return
	 */
	List<UserDto> allUsers();
	
	/**
	 * To delete a user by id
	 * @param id
	 */
	void deleteUser(Long id);

	
}
