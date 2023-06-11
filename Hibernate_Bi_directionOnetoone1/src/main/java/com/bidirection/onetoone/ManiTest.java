package com.bidirection.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ManiTest {

	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		
		Companye comp=new Companye();
		comp.setComp_Name("tcs");
		comp.setLocation("benagaluru");
		comp.setPhno(364646739384l);
		comp.setWebsite("www.tcs/fstre");
		
		Companye comp1=new Companye();
		comp1.setComp_Name("infosys");
		comp1.setLocation("bengaluru");
		comp1.setPhno(546575758798l);
		comp1.setWebsite("www.6454657/756s");
		
		
		GST gst=new GST();
		gst.setCountry("india");
		gst.setGst_no("tcs6454657yt");
		gst.setState("karnataka");

		
		
		GST gst1=new GST();
		gst1.setCountry("india");
		gst1.setGst_no("infosys68765575lij");
		gst1.setState("karnataka");
		
		
		comp.setGst(gst);
		comp1.setGst(gst1);
		
		
		gst.setCompanye(comp);
		gst1.setCompanye(comp1);
		
		t.begin();
		em.persist(comp);
		em.persist(comp1);
		em.persist(gst);
		em.persist(gst1);
		t.commit();

	}

}
