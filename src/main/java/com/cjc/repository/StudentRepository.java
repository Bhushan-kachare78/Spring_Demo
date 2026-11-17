package com.cjc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

//@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	
public Student findByUsernameAndPassword(String username,String password);

@Query("from Student")
public List<Student> getAll();


}
