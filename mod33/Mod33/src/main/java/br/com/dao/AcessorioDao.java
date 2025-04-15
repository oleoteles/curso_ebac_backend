/**
 * 
 */
package br.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.domain.Acessorio;
import br.com.domain.Carro;
import br.com.dao.IAcessorioDao;

/**
 * 
 */
public class AcessorioDao implements IAcessorioDao {
	
	@Override
	public Acessorio cadastrar(Acessorio acessorio) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(acessorio);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		
		
		return acessorio;
	}
}
