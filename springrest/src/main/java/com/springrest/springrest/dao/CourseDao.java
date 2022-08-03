package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long>
{
	//First parameter of JpaRepository is entity name and secondary is primary key's datatype(id)
	
}
