/**
 * 
 */
package dao;

import java.util.List;

import domain.Cliente;

/**
 * 
 */
public interface IClienteDAO {

	public Integer cadastrar(Cliente cliente) throws Exception;

	public Integer excluir(Cliente clienteBD) throws Exception;

	public Integer atualizar(Cliente cliente) throws Exception;

	public Cliente buscar(String codigo) throws Exception;

	public List<Cliente> buscarTodos() throws Exception;
}
