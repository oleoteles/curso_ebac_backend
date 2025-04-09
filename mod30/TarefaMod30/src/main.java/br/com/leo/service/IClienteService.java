/**
 * 
 */
package br.com.leo.service;

import br.com.leo.domain.Cliente;
import br.com.leo.exceptions.DAOException;
import br.com.leo.service.generic.IGenericService;

/**
 * 
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
