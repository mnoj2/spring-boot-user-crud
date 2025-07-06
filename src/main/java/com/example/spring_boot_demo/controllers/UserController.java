package com.example.spring_boot_demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_demo.entity.UserEntity;
import com.example.spring_boot_demo.exceptions.ResourceNotFoundException;
import com.example.spring_boot_demo.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	// Create User
	@PostMapping
	public UserEntity createUser(@RequestBody UserEntity user) {
		return userRepository.save(user);
	}
	
	// Get Single User
	@GetMapping("/{id}")
	public UserEntity getUserById(@PathVariable Long id) {
		return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User Not Found with this Id " + id));
	}
	
	// Get Users
	@GetMapping
	public List<UserEntity> getUsers() {
		return userRepository.findAll();
	}
	
	// Update User
	@PutMapping("/{id}")
	public UserEntity updateUser(@PathVariable Long id, @RequestBody UserEntity user) {
		UserEntity userData =  userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User Not Found with this Id " + id));
		userData.setEmail(user.getEmail());
		userData.setName(user.getName());
		return userRepository.save(userData);
	}
	
	// Delete User
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Long id) {
		UserEntity userData = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User Not Found with this Id " + id));
		userRepository.delete(userData);
		return ResponseEntity.ok().build();
	}
	
	
}
