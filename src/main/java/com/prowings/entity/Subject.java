package com.prowings.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column
	String subjectname;
	@Column
	String teacherName;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(int id, String subjectname, String teacherName) {
		super();
		this.id = id;
		this.subjectname = subjectname;
		this.teacherName = teacherName;
	}

	public int getId() {
		return id;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	

}
