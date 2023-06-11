package com.bidirectiom;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainTest {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		
		Hospital hosp =new Hospital();
		hosp.setName("siddalinga hospital");
		hosp.setPhno(000-7760-77112l);
		hosp.setWebsite("wwww.sillhyr/juyl");
		
		
		Hospital hosp1 =new Hospital();
		hosp1.setName("naik hospital");
		hosp1.setPhno(000-765-7112l);
		hosp1.setWebsite("wwww.naik/juyl");
		
		Branch bran=new Branch();
		bran.setLocation("bengaluru");
		bran.setName("banshakari");
		bran.setPhno(000-64657-6464l);
		bran.setWebsite("www.yetrt.sidd/bana");
		
		

		Branch bran1=new Branch();
		bran1.setLocation("bengaluru");
		bran1.setName("kormangla");
		bran1.setPhno(000-909-6464l);
		bran1.setWebsite("www.yetrt.sidd/kor");
		
		
		

		Branch bran2=new Branch();
		bran2.setLocation("bengaluru");
		bran2.setName("yelahanka");
		bran2.setPhno(000-345-6464l);
		bran2.setWebsite("www.yetrt.naik/yel");
		
		

		Branch bran3=new Branch();
		bran3.setLocation("bengaluru");
		bran3.setName("market");
		bran3.setPhno(000-909-6464l);
		bran3.setWebsite("www.yetrt.naik/mar");
		
		
		
		List <Branch> list=new ArrayList<Branch>();
		list.add(bran);
		list.add(bran1);
		
		
		List <Branch> list1=new ArrayList<Branch>();
		list1.add(bran2);
		list1.add(bran3);
		
		
		hosp.setBranch(list);
		hosp1.setBranch(list1);
		
		bran.setHospital(hosp);
		bran1.setHospital(hosp);
		
		bran2.setHospital(hosp1);
		bran3.setHospital(hosp1);
		
		t.begin();
		em.persist(hosp);
		em.persist(hosp1);
		em.persist(bran);
		em.persist(bran1);
		em.persist(bran2);
		em.persist(bran3);
		t.commit();
		

	}

}
