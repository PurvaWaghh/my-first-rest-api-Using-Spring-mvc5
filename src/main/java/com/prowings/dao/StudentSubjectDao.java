package com.prowings.dao;

import java.util.List;

import com.prowings.entity.Student;
import com.prowings.entity.Subject;

public interface StudentSubjectDao {
	
	public boolean saveStudent(Student std);
	
	public List<Student>getStudentlist();
	
	public List<Subject>getSubjectlist();
	
	public Student getStudent(int id);
	
	public Subject getSubject(int id);

}
