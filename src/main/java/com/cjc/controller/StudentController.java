package com.cjc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;
import com.cjc.service.StudentSrvice;

@Controller
public class StudentController {
	
//	@Autowired
	StudentSrvice si;
	
	public StudentController(StudentSrvice si) {
		
	   this.si=si;
	}

	@RequestMapping("/")
	public String homepage()
	{
		return "home";
		
	}
	
	@RequestMapping("/login")
	public String loginpage()
	{
		return"login";
		
	}
	
	@RequestMapping("/register")
	public String registerpage()
	{
		return"register";
		
	}
	
	
	@RequestMapping("/save")
	public String savepage(@ModelAttribute Student s)
	{
		System.out.println("IN Controller :-"+s.getName());
		si.saveData(s);
		return "login";
		
	}
	
	@RequestMapping("/loginsuccess")
	public String loginsuccess(@RequestParam("username")String un,@RequestParam("password")String ps, Model m)
	{
		Student st = si.loginCheck(un, ps);
		System.out.println(st.getName());
		
		
	List<Student>list=	si.getAllData();
//	list.forEach(s->System.out.println(s.getName()));
	m.addAttribute("data", list);
		return "loginsuccess";
		
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("rollno") int rollno, Model m) {
		si.deleteByRollno(rollno); //flow goes to service 
		List<Student> list = si.getAllData();
		m.addAttribute("data", list);
		return "loginsuccess";

	}
	
	@RequestMapping("/edit")
	public String editpage(@RequestParam("rollno") int rollno, Model m)
	{
	Student st=	si.getByRollno(rollno);
	m.addAttribute("stu", st);
	return "update";
		
	}
	
	@RequestMapping("/update")
	public String updatepage(@ModelAttribute Student s,Model m)
	{
		si.saveData(s);
		List<Student> list = si.getAllData();
		m.addAttribute("data", list);
		return "loginsuccess";

		 
	}
	
}
