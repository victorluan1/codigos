package dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import bean.JogoBean;
import entidade.Jogo;
import util.JPAUtil;


public class JogoDAO {

	public static void salvar(Jogo j) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
			em.persist(j);
		em.getTransaction().commit();
		em.close();
	}
	

	public static void atualizar(Jogo j) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(j);
		em.getTransaction().commit();
		em.close();
		
	}

	public static void deletar(Jogo j) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		j = em.find(Jogo.class, j.getId() );
		em.remove(j);
		em.getTransaction().commit();
		em.close();
	}
	
	
	public static List<Jogo> listar() {
		EntityManager em = JPAUtil.criarEntityManager();
		Query q = em.createQuery("select j from Jogo j");
		List<Jogo> lista = q.getResultList();
		em.close();
		return lista;
	}
}