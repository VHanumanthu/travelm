package com.example.travelm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.travelm.entity.Users;
import com.example.travelm.service.UsersService;

@RestController
public class UsersController {
	
	@Autowired
	private UsersService service;
	
	@PostMapping("/save")
	public Users saveUsers(@RequestBody Users users) {
		return service.saveUsers(users);
	}
	
	@GetMapping("/getusers/{id}")
	public Users getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	@GetMapping("/fetchAll")
	public List<Users> fetchAllStds() {
		return service.getAllStds();
	}
	
	@PutMapping("/updateUsers/{id}")
	public Users updateUsersDetails(@RequestBody Users users,@PathVariable Long id) {
		return service.updateDetails(users,id);
	}
	
	@DeleteMapping("/deleteUsers/{id}")
	public Users deleteUsers(@PathVariable Users id) {
		 return service.saveUsers(id);
	}
	
	
}
