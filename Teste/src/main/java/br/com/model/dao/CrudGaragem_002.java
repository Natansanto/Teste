package br.com.model.dao;

import java.util.List;

public interface CrudGaragem<T> {

	public abstract void salvar(T obg);

	public abstract void deletar(T obj);

	public abstract void alterar(T obj);

	public abstract List<T> listar();

	public abstract T getById(long id);

}
