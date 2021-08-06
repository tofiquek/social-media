package com.bacancy.SocialMedia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bacancy.SocialMedia.entity.User;
import com.bacancy.SocialMedia.repository.UserRepository;
/**
 * UserController is a RestController Which Contain REST API related to User
 * @author Tofique Ahmed Khan
 *
 */
@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/social-media/users")
	public List<User> retrieveAllUsers(){
		return userRepository.findAll(); 
	}
	
	@GetMapping("/social-media/users/{id}")
	public User retrieveUser(@PathVariable Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}
	
	@PostMapping("/social-media/users")
	public User createUser(@RequestBody User user) {
		User savedUser = userRepository.save(user);
		return savedUser;
	}
	
	@DeleteMapping("/social-media/users/{id}")
	public void deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
	}
	
}
