package com.bacancy.SocialMedia.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bacancy.SocialMedia.dto.PostDto;
import com.bacancy.SocialMedia.dto.UserDto;
import com.bacancy.SocialMedia.entity.User;
import com.bacancy.SocialMedia.repository.UserRepository;
import com.bacancy.SocialMedia.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDto addUser(UserDto userDto) {
		User user = modelMapper.map(userDto, User.class);
		User savedUser = userRepository.save(user);
		UserDto savedUserDto = modelMapper.map(savedUser, UserDto.class);
		
		return savedUserDto;
	}

	
	@Override
	public UserDto getUserById(Long id) {
		Optional<User> userOptional = userRepository.findById(id);
		UserDto userDto = null;
		if (userOptional.isPresent()) {
			
			userDto = modelMapper.map(userOptional.get(), UserDto.class);
		}
		return userDto;
	}
	
	@Override
	public List<UserDto> allUsers() {
		List<User> users = userRepository.findAll();
		List<UserDto> usersDto = users.stream().map(user -> modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
		return usersDto;
	}
	
	@Override
	public List<PostDto> getPostsByUserId(Long id) {
		UserDto userDto = getUserById(id);
		return userDto.getPosts();
	}
	
	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);;
		
	}

	
}