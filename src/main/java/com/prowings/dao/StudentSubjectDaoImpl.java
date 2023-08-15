package com.prowings.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prowings.entity.Student;
import com.prowings.entity.Subject;
@Repository
public class StudentSubjectDaoImpl implements StudentSubjectDao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	public boolean saveStudent(Student std) {
		
		boolean result=false;
		try {
			
		Session	session = sessionFactory.openSession();
		
		Transaction trx= session.beginTransaction();
		
		session.save(std);
		trx.commit();
		
		
		session.close();
		
		result= true;
		}
		
	 catch (Exception e) {

		System.out.println("Error occourd while storing the student " + e.getMessage());
	}
	return result;
}

	
	public List<Student> getStudentlist() {
		
		List<Student> listStudent=null;
		
		try {
			
			Session	session = sessionFactory.openSession();
			
			Transaction trx= session.beginTransaction();
			
			Query<Student>query= session.createQuery("from Student");
			
			listStudent=query.getResultList();
			trx.commit();
			session.close();
		}
		
		catch (HibernateException e) {
			
			System.out.println("exception"+e.getMessage());
		}
		
		return listStudent;
	}

	@Override
	public Student getStudent(int id) {
		
		Student std=null;
		
		Session	session = sessionFactory.openSession();
		
		Transaction trx= session.beginTransaction();
		
		std= session.get(Student.class, id);
		
		trx.commit();
		session.close();
		
		return std;
	}

	
	public List<Subject> getSubjectlist() {
		
	
			List<Subject> listSubject=null;
			
			try {
				
				Session	session = sessionFactory.openSession();
				
				Transaction trx= session.beginTransaction();
				
				Query<Subject>query= session.createQuery("from Subject");
				
				listSubject=query.getResultList();
				trx.commit();
				session.close();
			}
			
			catch (HibernateException e) {
				
				System.out.println("exception"+e.getMessage());
			}
			
			return listSubject;
		}

	
	public Subject getSubject(int id) {
		
		
		
        Subject sub=null;
		
		Session	session = sessionFactory.openSession();
		
		Transaction trx= session.beginTransaction();
		
		sub= session.get(Subject.class, id);
		
		trx.commit();
		session.close();
		
		return sub;
	}
	

}
