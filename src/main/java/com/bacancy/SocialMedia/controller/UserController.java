package com.bacancy.SocialMedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bacancy.SocialMedia.dto.UserDto;
import com.bacancy.SocialMedia.service.UserService;
/**
 * UserController is a RestController Which Contain REST API related to User
 * @author Tofique Ahmed Khan
 *
 */
@RestController
@RequestMapping("/social-media")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public ResponseEntity<List<UserDto>> findAllUsers(){
		return new ResponseEntity(userService.allUsers(), HttpStatus.OK);
	}
	
	@GetMapping("/users/{email}")
	public ResponseEntity<UserDto> findUser(@PathVariable String email) {
		return new ResponseEntity( userService.getUserByEmail(email),HttpStatus.OK);
	}
	
	@PostMapping("/users")
	public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto) {
		return new ResponseEntity(userService.addUser(userDto), HttpStatus.OK) ;
		
	}
	
	@DeleteMapping("/users/{email}")
	public ResponseEntity deleteUser(@PathVariable String email) {
		userService.deleteUser(email);
		return new ResponseEntity(HttpStatus.OK); 
	}
	
}
