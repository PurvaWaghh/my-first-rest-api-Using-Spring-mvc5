package com.prowings.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.entity.Student;
import com.prowings.entity.Subject;
import com.prowings.service.StudentSubjectService;

@RestController
public class StudentSubjectsController {
	@Autowired
	StudentSubjectService studentSubjectService;

	@PostMapping("/students")
	public String saveStudent(@RequestBody Student std) {

		if (studentSubjectService.saveStudent(std))

			return "student save sucefully";
		else

			return "student not save";
	}

	@GetMapping("/students")
	public List<Student> getStudent() {
		
		System.out.println("request received to list");
		
		return studentSubjectService.getStudentlist();
	}

	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		
		System.out.println("request recive to get student of id:" + id);

		Student retrivedStudent = studentSubjectService.getstudent(id);
		
		return retrivedStudent;
	}

	@GetMapping("/subjects")
	public List<Subject> getSubject() {
		
		System.out.println("request received to  subjectlist");
		
		return studentSubjectService.getSubjectlist();
	}
	
	@GetMapping("/students/{id}/subjects/{id}")
	public Subject getSubject(@PathVariable int id) {
		
		System.out.println("request recive to get subject of id:" + id);
		
		return studentSubjectService.getSubject(id);
	}
}
