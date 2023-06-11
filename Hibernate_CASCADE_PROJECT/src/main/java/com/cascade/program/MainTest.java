package com.cascade.program;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainTest {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		
		College college=new College();
		college.setLoc("chowkasandra");
		college.setName("scp college");
		college.setPhno(84654647647l);
		college.setWebsite("www.scp.private.college");

		
		College college1=new College();
		college1.setLoc("kanakapura");
		college1.setName("csp college");
		college1.setPhno(657676803346l);
		college1.setWebsite("www.cso.private.college");
		
		
		Student student =new Student();
		student.setLoc("chowkasandra");
		student.setName("naik");
		student.setPhno(64657575765l);
		student.setRoolno("kar 646475002");
		
		
		
		Student student1 =new Student();
		student1.setLoc("kanakapura");
		student1.setName("sidda");
		student1.setPhno(646576897564l);
		student1.setRoolno("kar476585985003");
		
		Student student2 =new Student();
		student2.setLoc("bengaluru");
		student2.setName("linga");
		student2.setPhno(757687989876l);
		student2.setRoolno("kar 74645460004");
		
		Student student3 =new Student();
		student3.setLoc("ramanagar");
		student3.setName("cs");
		student3.setPhno(7657687696867l);
		student3.setRoolno("kar yrtrv");
		
		
		List<Student> list=new ArrayList<Student>();
		list.add(student);
		list.add(student1);
		
		
		List<Student> list1=new ArrayList<Student>();
		list1.add(student2);
		list1.add(student3);
		
		
		college.setStudent(list);
		college1.setStudent(list1);
		
		student.setCollege(college);
		student1.setCollege(college);
		student2.setCollege(college1);
		student3.setCollege(college1);
		
		
		t.begin();
		em.persist(college);
		em.persist(college1);
		t.commit();
		
		
		
		
		
	}

}
