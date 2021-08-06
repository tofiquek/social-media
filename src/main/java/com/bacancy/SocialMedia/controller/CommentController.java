package com.bacancy.SocialMedia.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bacancy.SocialMedia.entity.Comment;
import com.bacancy.SocialMedia.entity.Post;
import com.bacancy.SocialMedia.entity.User;
import com.bacancy.SocialMedia.repository.CommentRepository;
import com.bacancy.SocialMedia.repository.PostRepository;
import com.bacancy.SocialMedia.repository.UserRepository;

@RestController
public class CommentController {
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CommentRepository commentRepository;
	
	@GetMapping("/social-media/{postId}/comments")
	public List<Comment> retrieveComments(@PathVariable Long postId){
		Optional<Post> posts = postRepository.findById(postId);
		return posts.get().getComments();
	}

	@PostMapping("/social-media/{userId}/{postId}/comments")
	public Comment addComment(@PathVariable Long userId,@PathVariable Long postId,@RequestBody Comment commentDto) {
		Optional<User> user = userRepository.findById(userId);
		Optional<Post> post = postRepository.findById(postId);
		User userDto = user.get();
		Post postDto = post.get();
		commentDto.setPost(postDto);
		commentDto.setUser(userDto);
		
		Comment savedComment = commentRepository.save(commentDto);
		return savedComment;
	}
	
	@DeleteMapping("/social-media/comments/{id}")
	public void deleteComment(@PathVariable Long id) {
		commentRepository.deleteById(id);
	}
}
