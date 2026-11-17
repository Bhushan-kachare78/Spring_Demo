package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentSrvice {

//	@Autowired
	StudentRepository sr;
	
	public StudentServiceImp(StudentRepository sr)
	{
		
		this.sr=sr;
	}
	
	@Override
	public void saveData(Student s) {
		
		System.out.println("In Service :"+s.getName());
		sr.save(s);  
		
	}

	@Override
	public List<Student> getAllData() {
//	List<Student>list=(List<Student>)sr.findAll();
	  List<Student> list = sr.getAll();
		return list;
	}

	@Override
	public void deleteByRollno(Integer rollno) {
		sr.deleteById(rollno);
		
		
	}

	@Override
	public Student getByRollno(Integer rollno) {
	Student st=	sr.findById(rollno).get();
		return st;
	}

	@Override
	public Student loginCheck(String username, String password) {
		
		Student st = sr.findByUsernameAndPassword(username, password);
		return st;
	}
	
	

}
