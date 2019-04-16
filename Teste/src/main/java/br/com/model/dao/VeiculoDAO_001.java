package br.com.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.connection.utils.ConnectionFactory;
import br.com.model.Veiculo;

public class VeiculoDAO implements CrudGaragem<Veiculo> {

	@Override
	public void salvar(Veiculo obg) {
		EntityManager em = new ConnectionFactory().getConnection();

		try {
			em.getTransaction().begin();
			em.persist(obg);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			em.getTransaction().rollback();

		} finally {
			em.close();
		}

	}

	@Override
	public void deletar(Veiculo obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void alterar(Veiculo obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public List listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Veiculo getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
