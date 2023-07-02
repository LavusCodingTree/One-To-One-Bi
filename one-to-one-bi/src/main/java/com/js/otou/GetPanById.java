package com.js.otou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPanById {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();

		Pan pan = em.find(Pan.class, 3);
		
			

			if (pan != null) {
				System.out.println("Pan Id = " + pan.getId());
				System.out.println("Pan No = " + pan.getPan_no());
				System.out.println("Pan Address = " + pan.getAddress());
			} else {
				System.out.println("Person has No Pan");
			}
		
	}
}
