package com.example.travelm.service;

import java.util.List;

import com.example.travelm.entity.Users;

public interface UsersService {
	public Users getById(Long id);
	public List<Users> getAllStds();
	public Users updateDetails(Users users,Long id);
	public String deleteUsers(Long id);
	public Users saveUsers(Users users);

	}
