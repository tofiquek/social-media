package com.bacancy.SocialMedia.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bacancy.SocialMedia.dto.UserDto;
import com.bacancy.SocialMedia.entity.User;
import com.bacancy.SocialMedia.repository.UserRepository;
import com.bacancy.SocialMedia.service.UserService;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDto addUser(UserDto user) {
		
		return null;
	}

	
	@Override
	public UserDto getUserById(Long id) {
		Optional<User> userOptional = userRepository.findById(id);
		UserDto userDto;
		if (userOptional.isPresent()) {
			
			User user = userOptional.get();
			userDto = populatedDto(user);
		}
		return null;
	}
	
	@Override
	public List<UserDto> allUsers() {
		List<User> users = userRepository.findAll();
		List<UserDto> usersDto = new ArrayList<UserDto>();
		for (Iterator iterator = users.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			UserDto userDto = populatedDto(user);
			usersDto.add(userDto);
		}
		
		return usersDto;
	}

	protected UserDto populatedDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setDateOfBirth(user.getDateOfBirth());
		userDto.setAddress(user.getAddress());
		userDto.setPosts(user.getPosts());
		return userDto;
	}
	
}
