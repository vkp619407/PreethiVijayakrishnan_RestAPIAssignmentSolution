package com.gl.employeemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.employeemanagement.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
