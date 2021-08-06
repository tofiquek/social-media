package com.bacancy.SocialMedia.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bacancy.SocialMedia.entity.Comment;
import com.bacancy.SocialMedia.entity.Like;
import com.bacancy.SocialMedia.entity.Post;
import com.bacancy.SocialMedia.entity.User;
import com.bacancy.SocialMedia.repository.LikeRepository;
import com.bacancy.SocialMedia.repository.PostRepository;
import com.bacancy.SocialMedia.repository.UserRepository;

@RestController
public class LikeController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private LikeRepository likeRepository;
	
//	@PostMapping("/social-media/{userId}/{postId}/likes")
//	public Like postLike(@PathVariable Long userId,@PathVariable Long postId) {
//		
////		Optional<LikeDto> alreadyLike = likeRepository.f
//		
//		Optional<User> user = userRepository.findById(userId);
//		Optional<Post> post = postRepository.findById(postId);
//		User userDto = user.get();
//		Post postDto = post.get();
//		Like likeDto = new Like();
//		likeDto.setPost(postDto);
//		likeDto.setUser(userDto);
//		
//		Like like = likeRepository.save(likeDto);
//		
//		return like;
//	}
//	
	
	
}
