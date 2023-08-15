package com.prowings.service;

import java.util.List;

import com.prowings.entity.Student;
import com.prowings.entity.Subject;

public interface StudentSubjectService {
	
	public boolean saveStudent(Student std);

	public List<Student> getStudentlist();
	
	public List<Subject> getSubjectlist();
	
	public Student getstudent(int id);

	public Subject getSubject(int id);
	
	
	
	

}
