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

import com.example.travelm.entity.Login;
import com.example.travelm.service.LoginService;




@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	
	@PostMapping("/add")
	public Login addLogin(@RequestBody Login login) {
		return loginservice.saveLogin(login);
	}
	
	@GetMapping("/getLogin/{id}")
	public Login getById(@PathVariable Long cId, LoginController loginservice) {
		return loginservice.getById(cId, loginservice);
	}
	
	@GetMapping("/getAll")
	public List<Login> fetchAlllogins() {
		return loginservice.getAllLogins();
	}
	
	@PutMapping("/updateLogin/{id}")
	public Login updateLoginDetails(@RequestBody Login login,Long lId) {
		return loginservice.updateLoginDetails(login, lId);
	}
	
	@DeleteMapping("/deleteLogin/{id}")
	public String deleteLogin(@PathVariable Long lid) {
		 return loginservice.deleteLogin(lid);
	}
	

}
