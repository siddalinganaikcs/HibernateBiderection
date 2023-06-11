package com.cascade.program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class find_remove {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		College uy = em.find(College.class, 1);
		
		
		t.begin();
        em.remove(uy);
        t.commit();
	}

}
