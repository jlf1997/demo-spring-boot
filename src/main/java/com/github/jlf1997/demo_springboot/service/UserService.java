package com.github.jlf1997.demo_springboot.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

import com.github.jlf1997.demo_springboot.jpa.UserJpa;
import com.github.jlf1997.demo_springboot.model.User;
import com.github.jlf1997.spring_boot_sdk.oper.SpringDateJpaOper;
import com.github.jlf1997.spring_boot_sdk.service.FindBase;
import com.github.jlf1997.spring_boot_sdk.service.SpringDataJpaFinder;

@Service("userService")
public class UserService extends FindBase<User, Long>{

	@Autowired	
	private UserJpa userJpa;
	
	
	@Override
	public JpaRepository<User, Long> jpa() {
		// TODO Auto-generated method stub
		return userJpa;
	}

	@Override
	public void setSelect(User arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JpaSpecificationExecutor<User> specjpa() {
		// TODO Auto-generated method stub
		return userJpa;
	}

	
	
	public List<User> findAgeLe(User u) {
		
		return super.findAll(new SpringDataJpaFinder<User>() {
			
			@Override
			public void where(List<Predicate>  predicates,Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb,User...user) {
				// TODO Auto-generated method stub
				
				if(user!=null  && user.length>0) {
					SpringDateJpaOper<User> springDateJpaOper = new SpringDateJpaOper<>(root,query,cb);
					if(user[0].getAge()!=null) {
						springDateJpaOper.ge(predicates,"age", user[0].getAge());
					
					}
				}
			}
		},u);
	}

	@Override
	public void addWhere(User[] t, List<Predicate> predicates, Root<User> root, CriteriaQuery<?> query,
			CriteriaBuilder cb) {
		// TODO Auto-generated method stub
		
	}



}
