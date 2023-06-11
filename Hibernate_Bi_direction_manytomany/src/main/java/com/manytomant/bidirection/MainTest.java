package com.manytomant.bidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainTest {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sidda");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		Person person=new Person();
		person.setAddress("bengaluru");
		person.setGender("male");
		person.setName("sida");
		person.setPhno(75877585858l);
		
		Person person1=new Person();
		person1.setAddress("mysur");
		person1.setGender("male");
		person1.setName("linga");
		person1.setPhno(867585858l);
		
		Person person2=new Person();
		person2.setAddress("kanakapura");
		person2.setGender("male");
		person2.setName("naik");
		person2.setPhno(976605858l);
		
		
		Cab cab=new Cab();
		cab.setCarNo("ka nh 6575");
		cab.setCost(54765.870);
		cab.setName("sidda");
		cab.setPhno(65657686979l);
		cab.setType("ac");
		
		

		Cab cab1=new Cab();
		cab1.setCarNo("ka yr 7589");
		cab1.setCost(7665.870);
		cab1.setName("naik");
		cab1.setPhno(98587686979l);
		cab1.setType("non_ ac");
		
		

		Cab cab2=new Cab();
		cab2.setCarNo("ka tr 7560");
		cab2.setCost(8536.870);
		cab2.setName("linga");
		cab2.setPhno(986686979l);
		cab2.setType("ac");
		
		

		Cab cab3=new Cab();
		cab3.setCarNo("ka yht 7454");
		cab3.setCost(43565.870);
		cab3.setName("cs");
		cab3.setPhno(9856686979l);
		cab3.setType("non_ac");
		
		
		List<Person> perlist =new ArrayList<Person>();
		perlist.add(person);
		perlist.add(person1);
		
		List<Person> perlist1 =new ArrayList<Person>();
		perlist1.add(person1);
		perlist1.add(person2);
		
		List<Person> perlist2=new ArrayList<Person>();
		perlist2.add(person2);
		perlist2.add(person);
		
		
		
		List<Cab> cablist =new ArrayList<Cab>();
		cablist.add(cab);
		cablist.add(cab1);
		
		List<Cab> cablist1 =new ArrayList<Cab>();
		cablist1.add(cab2);
		cablist1.add(cab3);
		
		List<Cab> cablist2=new ArrayList<Cab>();
		cablist2.add(cab2);
		cablist2.add(cab3);
		cablist2.add(cab1);
		cablist2.add(cab);
		

		person.setCabs(cablist);
		person1.setCabs(cablist1);
		person2.setCabs(cablist2);
		
		cab.setPersons(perlist);
		cab1.setPersons(perlist1);
		cab2.setPersons(perlist2);
		
		t.begin();
		em.persist(person);
		em.persist(person1);
		em.persist(person2);
		em.persist(cab);
		em.persist(cab1);
		em.persist(cab2);
		em.persist(cab3);
		t.commit();
		
		
		
		
		

	}

}
