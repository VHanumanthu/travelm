package com.example.travelm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.travelm.entity.Login;



@Repository
public interface LoginRepo extends JpaRepository<Login,Long> {

}