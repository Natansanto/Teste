package br.com.model.dao;

import javax.persistence.EntityManager;

import br.com.connection.utils.ConnectionFactory;
import br.com.model.Pessoa;

public class PessoaDAO {

	public Pessoa salva(Pessoa pessoa) {
		EntityManager em = new ConnectionFactory().getConnection();

		try {
			em.getTransaction().begin();
			em.persist(pessoa);
			em.getTransaction().commit();

		} catch (Exception e) {
			em.getTransaction().rollback();

		} finally {

			em.close();
		}

		return pessoa;

	}

}
