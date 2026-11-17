package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface StudentSrvice {

	
	public void saveData(Student s);
	
	public List<Student> getAllData();
	
	public void deleteByRollno(Integer rollno);
	
	public Student getByRollno(Integer rollno);
	
	public Student loginCheck(String username,String password);

}
