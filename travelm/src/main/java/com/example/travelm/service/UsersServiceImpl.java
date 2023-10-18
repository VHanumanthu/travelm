package com.example.travelm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.travelm.entity.Users;
import com.example.travelm.repo.UsersRepo;

import jakarta.transaction.Transactional;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersRepo repo;
	@Override
	public Users saveUsers(Users users) {
		// TODO Auto-generated method stub
		return repo.save(users);
	}

	@Override
	public Users updateDetails(Users users, Long id) {
		// TODO Auto-generated method stub
		Users updateUsers=repo.findById(users.getId()).orElse(null);
		if(updateUsers!=null) {
			updateUsers.setlName(users.getlName());
			updateUsers.setlEmail(users.getlEmail());
			
			repo.save(updateUsers);
			return updateUsers;
		}
		return null;
	}

	@Override
	public String deleteUsers(Long lid) {
		repo.deleteById(lid);
		return "deleted lid is " +lid;
	}

	@Override
	public Users getById(Long id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}

	@Override
	public List<Users> getAllStds() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}