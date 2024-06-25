package com.spring.orm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entites.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate; 
	
	@Autowired
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
