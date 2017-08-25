package br.com.model.dao.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionHiber{

	private static ConnectionHiber instancia = null;
	private EntityManager entityManager;
	
	private ConnectionHiber() {
		entityManager = getEntityManager();
	}
	
	public synchronized EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("APAE-PU");
		if (entityManager == null || !entityManager.isOpen()) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
	
	public static synchronized ConnectionHiber getConnectionXML() {
		if(instancia == null) {
			return instancia = new ConnectionHiber();
		}else {return instancia;}
		
	}

}
