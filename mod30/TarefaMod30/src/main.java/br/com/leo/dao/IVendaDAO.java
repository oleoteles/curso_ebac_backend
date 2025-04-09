/**
 * 
 */
package br.com.leo.dao;

import br.com.leo.dao.generic.IGenericDAO;
import br.com.leo.domain.Venda;
import br.com.leo.exceptions.DAOException;
import br.com.leo.exceptions.TipoChaveNaoEncontradaException;

/**
 * 
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}