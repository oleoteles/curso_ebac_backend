/**
 * 
 */
package br.com.leo.service.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.leo.dao.IPersistente;
import br.com.leo.dao.generic.jpa.IGenericJpaDAO;
import br.com.leo.exceptions.DAOException;
import br.com.leo.exceptions.MaisDeUmRegistroException;
import br.com.leo.exceptions.TableException;
import br.com.leo.exceptions.TipoChaveNaoEncontradaException;

/**
 * 
 */
public abstract class GenericJpaService<T extends IPersistente, E extends Serializable> 
implements IGenericJpaService<T, E> {

protected IGenericJpaDAO<T, E> dao;

public GenericJpaService(IGenericJpaDAO<T, E> dao) {
	this.dao = dao;
}


@Override
public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
	return this.dao.cadastrar(entity);
}

@Override
public void excluir(T entity) throws DAOException {
	this.dao.excluir(entity);
}

@Override
public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
	return this.dao.alterar(entity);
}

@Override
public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
	return this.dao.consultar(valor);
}

@Override
public Collection<T> buscarTodos() throws DAOException {
	return this.dao.buscarTodos();
}

}
