package br.com.model.dao;

import javax.persistence.EntityManager;

import br.com.connection.ConnectionFactory;

public class CriarLancamentos {

	
	public static void main(String[] args) {
		EntityManager em = new ConnectionFactory().getConnection();
		
		try {
			
			
			
			
			
			
			
			
		}catch(Exception e) {
			em.getTransaction().rollback();
			
		
		}finally {
			em.close();
		}
		
		
		
		
	}
}
