package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("AP2");
	
	public static EntityManager criarEntityManager() {
		return emf.createEntityManager();
	}
}