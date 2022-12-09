package com.educandoweb.course.repositories;

import java.util.List;
import java.util.Arrays;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
	

}
