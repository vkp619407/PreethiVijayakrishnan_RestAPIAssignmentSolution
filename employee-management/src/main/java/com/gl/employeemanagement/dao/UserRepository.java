package com.gl.employeemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.employeemanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);

}
