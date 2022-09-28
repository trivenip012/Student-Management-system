package com.example.studentmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.studentmanagement.model.Course;
import com.example.studentmanagement.model.StudentDAO;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.service.CourseService;
import com.example.studentmanagement.service.StudentService;

@Controller
@RequestMapping("/")
public class IndexController 
{
	@Autowired
	private CourseService service;
	
	@Autowired
    private StudentService services;
	
	@Autowired
	private StudentRepository studentRepository;
 
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String viewStudentPage(Model model)
	 {
		List<StudentDAO> li = new ArrayList<>();
		for(Object[] o : studentRepository.findStudent())
		{
			StudentDAO student= new StudentDAO();
			student.setId(Long.parseLong(String.valueOf(o[0])));
			student.setStname((String) o[1]);
			student.setStname((String) o[2]);
			li.add(student);
		}
       model.addAttribute("liststudent", li);
       return "student";
	 }
	
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value = "/course", method = RequestMethod.GET)
	public String viewHomePage(Model model)
	 {
		List<Course> listcourse = service.listAll();
       model.addAttribute("listcourse", listcourse);
       System.out.println("Get / ");
       return "Course";
	 }
}
