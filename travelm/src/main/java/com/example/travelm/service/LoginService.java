package com.example.travelm.service;

import java.util.List;

import com.example.travelm.entity.Login;



public interface LoginService {
	public Login saveLogin(Login login);
	public Login getById(Long lid);
	public List<Login> getAllLogins();
	public Login updateLoginDetails(Login login,Long lId);
	public String deleteLogin(Long lId);

}