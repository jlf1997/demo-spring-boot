package com.github.jlf1997.demo_springboot.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.github.jlf1997.demo_springboot.model.User;
import com.github.jlf1997.spring_boot_sdk.service.FindBase;

public class UserLogService extends FindBase<User, Long>{

	@Override
	public JpaSpecificationExecutor<User> specjpa() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JpaRepository<User, Long> jpa() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addWhere(User[] t, List<Predicate> predicates, Root<User> root, CriteriaQuery<?> query,
			CriteriaBuilder cb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelect(User t) {
		// TODO Auto-generated method stub
		
	}

}
