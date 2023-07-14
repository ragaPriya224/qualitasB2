package com.qualitas.qualitasPractice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qualitas.qualitasPractice.model.Student;

@RestController
public class StudentController {

	@GetMapping("/student")
	public List<Student> getStudents() {
//		List detail = new ArrayList();
//		detail.add("xx");
//		detail.add("yy");
//		detail.add("zz");
		Student s = new Student();
		s.setName("satish");
		s.setMajor("cs");
		s.setStudentId("101");
		
		Student s2 = new Student();
		s2.setName("prasanth");
		s2.setMajor("it");
		s2.setStudentId("102");
		
		List<Student> studentList =  new ArrayList<Student>();
		studentList.add(s);
		studentList.add(s2);
		return studentList;
	}
	
	
	
}
