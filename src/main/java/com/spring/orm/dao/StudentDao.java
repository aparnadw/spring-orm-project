package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entites.Student;

import jakarta.transaction.Transactional;

public class StudentDao {

	private HibernateTemplate hibernateTemplate; 
	
	@Transactional
	public int insert(Student student) {
		
		Integer i = (Integer) this.hibernateTemplate.save(student);
		System.out.println("response ---------------" + i);
		return i;
		
	}
	

	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
