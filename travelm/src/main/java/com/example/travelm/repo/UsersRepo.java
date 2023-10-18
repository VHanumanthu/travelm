package com.example.travelm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.travelm.entity.Users;



@Repository
public interface UsersRepo extends JpaRepository<Users,Long>{

}