package com.prowings.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Student {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Column
	int roll;
	 
	@Column
	String name;
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
	  @JoinColumn(name = "STD_ID")
		@Autowired
	List<Subject> subject;


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int id, int roll, String name, List<Subject> subject) {
		super();
		this.id = id;
		this.roll = roll;
		this.name = name;
		this.subject = subject;
	}


	public int getId() {
		return id;
	}


	public int getRoll() {
		return roll;
	}


	public String getName() {
		return name;
	}


	public List<Subject> getSubject() {
		return subject;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", roll=" + roll + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
	
	
}

