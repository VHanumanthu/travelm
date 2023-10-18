package com.example.travelm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.travelm.entity.Login;
import com.example.travelm.entity.Users;
import com.example.travelm.repo.LoginRepo;



@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginRepo repo;
	@Override
	public Login saveLogin(Login login) {
		// TODO Auto-generated method stub
		return repo.save(login);
	}

	@Override
	public Login updateLoginDetails(Login login, Long lId) {
		// TODO Auto-generated method stub
		Login updateLogin=repo.findById(login.getlId()).orElse(null);
		if(updateLogin!=null) {
			updateLogin.setlName(login.getlName());
			updateLogin.setLmail(login.getLmail());
			
			repo.save(updateLogin);
			return updateLogin;
		}
		return null;
	}
	@Override
	public String deleteLogin(Long lId) {
		// TODO Auto-generated method stub
		repo.deleteById(lId);
		return "deleted loginid is "+lId;
	}

	@Override
	public Login getById(Long lId) {
		// TODO Auto-generated method stub
		
		return repo.findById(lId).get();
	}

	@Override
	public List<Login> getAllLogins() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


}