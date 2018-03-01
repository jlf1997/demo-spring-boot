package com.github.jlf1997.demo_springboot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.github.jlf1997.demo_springboot.model.User;

public interface UserJpa extends JpaRepository<User,Long>,JpaSpecificationExecutor<User>{

}
